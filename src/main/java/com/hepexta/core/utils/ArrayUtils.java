package com.hepexta.core.utils;

/**
 * Утилитарный класс для работы с массивами.
 *
 * @author Sergei Kuznetsov.
 */
public abstract class ArrayUtils {

	public static <T> void nullify( T[] array ){
		if( array!=null ){
			for( int index = 0; index < array.length; index++ ){
				array[ index ] = null;
	}	}	}
	
	public static <T> void move( T[] from, T[] to ){
		move( from, to, 0, 0 );
	}

	public static <T> void move( T[] from, T[] to, int fromQty, int toStart ){
		
		// Рыпаемся, только если заданы оба массива
		if( from!=null && to!=null ){
			
			// Уточним количество переносимых элементов из массива-источника.
			fromQty = BooleanUtils.ternary( fromQty > 0, fromQty, from.length ); 
			
			// Количество переносимых элементов
			int minCount = Math.min( fromQty, to.length - toStart );
			
			// Переносим элементы
			for( int index = 0; index < minCount; index++ ){
				to[ toStart + index ] = from[ index ];
	}	}	}
	
	public static <T> int length( T[] array ){
		return ( array==null ? 0 : array.length );
	}
	
	public static <T> boolean isEmpty( T[] array ){
		return ( array==null ) || ( array.length==0 );
	}

	public static <T> boolean isNotEmpty( T[] array ){
		return ( isEmpty(array)==false );
	}

	public static <T> boolean notContains( T value, T...array ){
		return ( contains(value, array)==false );
	}

	public static <T> boolean contains( T value, T...array ){
		
		// Результат - признак обнаружения элемента в массиве.
		boolean found = false;
		
		// Рыпаемся, только если массив задан.
		if( isNotEmpty(array) ){
			for( T element : array ){
				found = ( value==null ) ? ( element==null ) : ( element==null ? false : value.equals(element) );
				if( found ){
					break;
		}	}	}
		
		// Возвращаем результат поиска.
		return found;
	}
	
	public static <T> T get( T[] array, int index ){
		T item = null;
		if( index>=0 && length(array)>index ){
			item = array[ index ];
		}
		return item;
	}


	public static <T> T first( T[] array ){
		return get( array, 0 );
	}
}
