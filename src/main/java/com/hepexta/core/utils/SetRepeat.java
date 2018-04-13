package com.hepexta.core.utils;

import com.hepexta.core.cnst.Const;

import java.util.Set;

public abstract class SetRepeat<T> {


	public SetRepeat( int batch, Set<T> set, boolean copy, boolean dropNulls ){
		
		// Определим набор, который будем нарезать.
		Set<T> setForCut = copy ? SetUtils.addAll( null, set ) : set;
		if( dropNulls ){
			SetUtils.dropNull( setForCut );
		}
		
		// Выполняем нарезку до тех пор, пока набор не опустеет.
		while( CollectUtils.isNotEmpty(setForCut) ){
			
			// Отрезаем кусок от набора.
			Set<T> piece = SetUtils.cut( setForCut, batch ); 
			
			// Проведём операцию над этим куском.
			process( piece );
	}	}

	public SetRepeat( int batch, Set<T> set, boolean copy ){
		this( batch, set, copy, true );
	}

	public SetRepeat( Set<T> set, boolean copy ){
		this( Const.MAX_BATCH_FOR_IN_SQL_STATEMENT, set, copy );
	}

	protected abstract void process( Set<T> set );
}
