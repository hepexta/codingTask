package com.hepexta.core.utils;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 * @author Sergei Kuznetsov.
 */
public abstract class CollectUtils {

	public static boolean isEmpty( Collection<?> collection ){
		return ( collection==null ) || collection.isEmpty();
	}

	public static boolean isNotEmpty( Collection<?> collection ){
		return ( isEmpty(collection)==false );
	}

	public static int size( Collection<?> collection ){
		return ( collection==null ) ? 0 : collection.size();
	}

	public static boolean one( Collection<?> collection ){
		return ( size(collection)==1 );
	}

	public static boolean isZero( Collection<?> collection ){
		return ( collection!=null && collection.isEmpty() );
	}

	public static boolean isNotZero( Collection<?> collection ){
		return ( isZero(collection)==false );
	}

	//------------------------------------------------------------

	public static <T> boolean remove( Collection<T> collection, T...elements ){
		boolean removed = false;
		if( collection!=null && ArrayUtils.isNotEmpty(elements) ){
			for( T element : elements ){
				Boolean elementRemoved = collection.remove( element );
				removed = removed || elementRemoved;
		}	}
		return removed;
	}	

	public static <T> boolean dropNull( Collection<T> collection ){
		return remove( collection, (T) null );
	}
	
	//------------------------------------------------------------

	public static <T> boolean contains( Collection<T> collection, T value ){
		return ( collection!=null && collection.contains(value) );
	}

	public static <T> boolean notContains( Collection<T> collection, T value ){
		return ( contains( collection, value ) == false );
	}
	
	//------------------------------------------------------------

	public static <T> T[] toArray( Collection<T> collection ){
		T[] array = null;
		int size = CollectUtils.size( collection );
		if( size > 0 ){
			
			// Определим тип элемента коллекции.
			Class<T> classT = null;
			for( T element : collection ){
				if( element!=null ){
					classT = (Class<T>) element.getClass();
					break;
			}	}
			
			// Создадим массив, если тип элемента массива понятен.
			if( classT!=null ){
				array = (T[]) Array.newInstance( classT, size );
				array = collection.toArray( array );
		}	}
		return array;
	}

	//------------------------------------------------------------
	
}