package com.hepexta.core.utils;

/**
 * @author Sergei Kuznetsov.
 */
public abstract class BooleanUtils {

	public static boolean isTrue( Boolean...values ){
		boolean result = ( values.length > 0 );
		for( int index = 0; (index < values.length) && result; index++ ){
			Boolean value = values[ index ];
			result = ( result && value!=null && value );
		}
		return result;
	}

	public static boolean isPartTrue( Boolean...values ){
		boolean result = ( values.length==0 );
		for( int index = 0; (index < values.length) && (result==false); index++ ){
			Boolean value = values[ index ];
			result = ( value!=null && value );
		}
		return result;
	}
	
    public static boolean isTrue( Short value ){
        return (value!=null && value!=0);
    }

	public static boolean isTrue( Integer value ){
		return (value!=null && value!=0);
	}

    public static boolean isTrue( Byte value ){
        return (value!=null && value!=0);
    }

    public static boolean isTrue( String value ){
        return (value!=null &&(value.equalsIgnoreCase("true") || value.equalsIgnoreCase("1")));
    }

    public static boolean isTrueFromNumber(String value) {
        if (value.equalsIgnoreCase("1")) {
            return true;
        } else {
            if (value.equalsIgnoreCase("0")) {
                return false;
            } else {
                throw new IllegalArgumentException("Param must specified ("+value+")");
            }
        }
    }

	public static boolean isFalse( Boolean...values ){
		boolean result = ( values.length > 0 );
		for( int index = 0; (index < values.length) && result; index++ ){
			Boolean value = values[ index ];
			result = ( result && value!=null && value == false );
		}
		return result;
	}

	public static boolean isFalse( Boolean value ){
		return (value!=null && value.booleanValue()==false);
	}

	public static Boolean nullForFalse( Boolean value ){
		return isFalse( value ) ? null : value;
	}

	public static boolean falseForNull( Boolean value ){
		return ( value == null ? false : value.booleanValue() );
	}

    public static <T> T ternary( Boolean condition, T ifTrue, T ifFalse ){
    	return isTrue(condition) ? ifTrue : ifFalse;
    }

    public static <T> T use( Boolean condition, T value ){
    	return ternary( condition, value, (T) null );
    }

    public static boolean isAllNull( Object... values ){

    	boolean result = true;

    	if( values != null ){
    		int index = 0;
    		for( index = 0; index < values.length && values[index] == null; index++ );
    		result = index == values.length;
    	}

    	return result;
    }

    public static boolean isPartNotNull( Object... values ){

    	boolean result = false;

    	if( values != null ){
    		int index = 0;
    		for( index = 0; index < values.length && values[index] == null; index++ );
    		result = index != values.length;
    	}

    	return result;
    }
}