package com.hepexta.core.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class SetUtils extends CollectUtils {

	public static <T> Set<T> addIf( boolean condition, Set<T> set, T...values ){
		if( condition ){
			set = add( set, values );
		}
		return set;
	}

	public static <T> Set<T> add( Set<T> set, T...values ){
		set = emptyForNull( set );
		if( values!=null ){
			for( int index = 0; index < values.length; index++ ){
				set.add( values[index] );
		}	}
		return set;
	}
	public static <T> Set<T> addNotNull( Set<T> set, T...values ){
		if( values!=null ){
			for( int index = 0; index < values.length; index++ ){
				T value = values[index];
				if( value!=null ){
					set = add( set, value );
		}	}	}
		return set;
	}

	public static <T> Set<T> addNotNull( Set<T> set, Collection<T> collection ){
		if( CollectUtils.isNotEmpty(collection) ){
			for( T value : collection ){
				if( value!=null ){
					set = add( set, value );
		}	}	}
		return set;
	}

	public static <T> Set<T> addAll( Set<T> set, Collection<T> collection ){
		if( CollectUtils.isNotEmpty(collection) ){
			for( T value : collection ){
				set = add( set, value );
		}	}
		return set;
	}
	
	public static <T> Set<T> toSet( T... elements ){
		return add( null, elements );
    }

	public static <T> Set<T> toSet( Collection<T> collection ){
		return addAll( null, collection );
    }

	public static <T> Set<T> emptyForNull( Set<T> set ){
		return ( set==null ) ? new HashSet<T>() : set;
	}

	public static <T> Set<T> empty(){
		return new HashSet<T>();
	}

	public static <T> Set<T> empty( int initialCapacity ){
		return new HashSet<T>( initialCapacity );
	}
	
	public static <T> Set<T> nullForEmpty( Set<T> set ){
		return ( isEmpty(set) ? null : set );
	}
	
	public static <T> Set<T> removeAll( Set<T> set, Collection<T> collection ){
		if( set!=null && CollectUtils.isNotEmpty(collection) ){
			set.removeAll( collection );
		}
		return set;
	}

	public static <T> Set<T> cut( Set<T> set, int count ){
		Set<T> result = null;
		if( isNotEmpty(set) && count > 0 ){
            int maxCutSize = Math.min( count, set.size() );
            result = empty( maxCutSize );
            Iterator<T> iterator = set.iterator();
            while( ( maxCutSize-- ) > 0 ) {
				result.add( iterator.next() );
            }
            removeAll( set, result );
		}	
		return result;
	}
	
	public static <T> T cut( Set<T> set ){
		T result = null;
		if( isNotEmpty(set) ){
			result = set.iterator().next();
			remove( set, result );
		}
		return result;
	}

}