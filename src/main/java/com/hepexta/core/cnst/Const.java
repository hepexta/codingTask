package com.hepexta.core.cnst;

import com.sun.deploy.util.StringUtils;

/**
 * @author Sergei Kuznetsov
 */
public interface Const {

	/** Константа пустой строки */
	public final static String EMPTY = "";

	//------------------------------------------------------------
	// Точки.

	/** Константа односимвольной строки "." (точка) */
	public final static String POINT = ".";

	/** Константа символа точки '.' */
	public final static char POINT_CHAR = '.';

	/** Константа точки с пробелом ". " */
	public final static String POINT_SPACE = ". ";

	//------------------------------------------------------------
	// Запятые.

	/** Константа запятой "," */
	public final static String COMMA = ",";

	/** Константа односимвольной запятой ',' */
	public final static char COMMA_CHAR = ',';

	/** Константа запятой с пробелом ", " */
	public final static String COMMA_SPACE = ", ";

	//------------------------------------------------------------
	// Пробелы.	

	/** Константа пробела " " */
	public final static String SPACE = " ";

	/** Константа пробела ' ' (односимвольная) */
	public final static char SPACE_CHAR = ' ';

	//------------------------------------------------------------
	// Двоеточия.
	
	/** Константа двоеточия ":" */
	public final static String COLON = ":";

	/** Константа односимвольного двоеточия ':' */
	public final static char COLON_CHAR = ':';

	/** Константа двоеточия с пробелом ": " */
	public final static String COLON_SPACE = ": ";

	//------------------------------------------------------------
	// Точки с запятыми.

	/** Константа точки с запятой ";" */
	public final static String SEMICOLON = ";";

	/** Константа точки с запятой и пробела "; " */
	public final static String SEMICOLON_SPACE = "; ";

	//------------------------------------------------------------
	// Скобки.

	/** Константа левой круглой (открывающей) скобки "(" */
	public final static String LEFT_BRACKET = "(";

	/** Константа правой круглой (закрывающей) скобки ")" */
	public final static String RIGHT_BRACKET = ")";

	/** Константа левой квадратной (открывающей) скобки "[" */
	public final static String LEFT_SQ_BRACKET = "[";

	/** Константа правой квадратной (закрывающей) скобки "]" */
	public final static String RIGHT_SQ_BRACKET = "]";

	/** Константа левой (открывающей) фигурной скобки '{' */
	public final static char LF_BRACKET = '{';

	/** Константа правой (закрывающей) фигурной скобки '}' */
	public final static char RF_BRACKET = '}';

	/** Константа левой угловой (открывающей) скобки '<' */
	public final static char LEFT_CRN_BRACKET = '<';

	/** Константа правой угловой (закрывающей) скобки '>' */
	public final static char RIGHT_CRN_BRACKET = '>';

	//------------------------------------------------------------
	// Табуляция.

	/** Константа символа табуляции '\t' */
	public final static char TAB_CHAR = '\t';

	/** Константа табуляции "\t" */
	public final static String TAB = "\t";

	/** Константа двойной табуляции "\t\t" */
	public final static String TABx2 = "\t\t";

	/** Константа тройной табуляции "\t\t\t" */
	public final static String TABx3 = "\t\t\t";

	/** Константа четверной табуляции "\t\t\t\t" */
	public final static String TABx4 = "\t\t\t\t";

	/** Константа пятерной табуляции "\t\t\t\t\t" */
	public final static String TABx5 = "\t\t\t\t\t";

	//------------------------------------------------------------

	/** Константа символа тильды '~' */
	public final static char TILDE_SYMBOL = '~';

	/** Константа решётки "#" */
	public final static String SHARP = "#";

	/** Константа звездочки "*" */
	public final static String ASTERISK = "*";

	/** Константа тире "-" */
	public final static String DASH = "-";

	/** Константа знака равенства "=" */
	public final static String EQUAL = "=";

	/** Константа прямого слеша "/" */
	public final static String SLASH = "/";

	/** Константа символа прямого слеша '/' */
	public final static char SLASH_CHAR = '/';
	
	/** Константа символа амперсанда '&' */
	public final static char AMP_CHAR = '&';

	/** Константа нижнего подчёркивания "_" */
	public final static String UNDERLINE = "_";

	/** Константа нижнего подчёркивания '_' (символ) */
	public final static char UNDERLINE_CHAR = '_';

	/** Константа обратного слеша (строка) "\" */
	public final static String BACK_SLASH = "\\";
	
	/** Константа обратного слеша (символ) '\' */
	public final static char BACK_SLASH_CHAR = '\\';
	
	/** Константа процента "%" */
	public final static String PERCENT = "%";

	/** Константа символа возврата каретки '\r' */
	public final static char CR_CHAR = '\r';

	/** Константа символа перехода на новую строку '\n' */
	public final static char LF_CHAR = '\n';

	/** Просто сплошная линия */
	public final static String LINE = "-------------------------";

	/** Просто пунктирная линия */
	public final static String DOT_LINE = "- - - - - - - - - - - - -";

	/** Константа двойной кавычки "\"" */
	public final static String DQUOTE = "\"";

	/** Константа одинарной кавычки "'" */
	public final static String QUOTE = "'";

	/** Константа символа двойной кавычки '"' */
	public final static char DQUOTE_CHAR = '"';

	/** Константа "нет данных": &lt;н/д&gt; */
	public final static String NO_DATA = "<н/д>";

	/** Константа "нет текста": &lt;нет текста&gt; */
	public final static String NO_TEXT = "<нет текста>";

	/** Константа "null" */
	public final static String NULL = "null";

	/** Константа "unknown" */
	public final static String UNKNOWN = "unknown";

	/** Константа "NotificationList" */
	public final static String NOTIFICATION_LIST = "NotificationList";
	
	/** Константа "NTFID" */
	public static final String NTFID = "NTFID";
	
	/** Константа "NTFMessage" */
	public static final String NTFMESSAGE = "NTFMessage";

	/** Константа "OK" */
	public static final String OK = "OK";

	/** Путь внутри до файла манифеста */
	public final static String MANIFEST = "/META-INF/MANIFEST.MF";

	//------------------------------------------------------------
	// Шаблоны дат.

	/** Шаблон (паттерн) для работы с датами в представлении dd.MM.yyyy HH:mm:ss */
	public final static String SDF_DMYHMS = "dd.MM.yyyy HH:mm:ss";

	/** Шаблон (паттерн) для работы с датами в представлении dd.MM.yyyy */
	public final static String SDF = "dd.MM.yyyy";

	/** Шаблон (паттерн) для работы с датами в представлении dd/MM/yyyy */
	public final static String SDF2 = "dd/MM/yyyy";

	/** Шаблон (паттерн) для работы с датами в представлении yyyy-MM-dd */
	public final static String SDF3 = "yyyy-MM-dd";

	/** Шаблон (паттерн) для работы с датами в представлении yyMMdd */
	public final static String SDF4 = "yyMMdd";

    /** Шаблон (паттерн) для работы с датами в представлении yyyy.MM.dd */
    public final static String SDF5 = "yyyy.MM.dd";

    /** Шаблон (паттерн) для работы с датами в представлении 2013-01-21T04:00:00.000+0400 */
    public final static String SDF6 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

	/** Шаблон (паттерн) для работы с датами в представлении dd.MM.yyyy HH:mm:ss z */
	public final static String SDF7 = "dd.MM.yyyy HH:mm:ss z";

	/** Шаблон (паттерн) для работы с датами в представлении dd.MM.yyyy HH:mm */
	public final static String SDF8 = "dd.MM.yyyy HH:mm";

	/** Шаблон (паттерн) для работы с датами в представлении yyyy */
	public final static String SDF9 = "yyyy";
	
	/** Шаблон (паттерн) для работы с датами в представлении HH-mm */
	public final static String SDF10 = "HH-mm";

	/**
	 * Шаблон (паттерн) для работы с датами в представлении
	 * EEE MMM dd HH:mm:ss zzz yyyy
	 * 
	 * Например, Wed Apr 04 11:48:21 MSD 2012
	 */
	public final static String SDF_COMPLEX = "EEE MMM dd HH:mm:ss zzz yyyy";

	/** Шаблон (паттерн) для работы с датами в представлении dd.MM.yyyy HH:mm:ss.SSS */
	public final static String SDF_FULL = "dd.MM.yyyy HH:mm:ss.SSS";

	/** Шаблон (паттерн) для работы с датами в представлении yyyy-MM-dd HH:mm:ss Z */
	public final static String SDF_SVN = "yyyy-MM-dd HH:mm:ss Z";

	//------------------------------------------------------------
	// Шаблоны времени.

	/** Шаблон (паттерн) для работы с временем в представлении HH:mm:ss */
	public final static String STF = "HH:mm:ss";

	//------------------------------------------------------------
	// Кодировки
	
	/** Обозначение кодировки Windows-1251 */
	public final static String CP1251 = "Cp1251";

	/** Обозначение кодировки Unicode */
	public final static String UTF8 = "UTF-8";

	//------------------------------------------------------------

	/** Константа идентификатора связи */
	public final static String LINK_ID = "LinkID";

	//------------------------------------------------------------

	/**
	 * Константа неверного индекса (-1).
	 * Используется, в основном, для того, чтобы указать, что актуальный
	 * (правильный) индекс не существует или ещё не рассчитан.
	 */
	public static final int BAD_INDEX = -1;
	
    /**
     * Максимальное количество элементов которые можно передать в конструкцию IN (...) выражения SQL.
     * Установленно значение 1000, так как это максимальное для Oracle
     */
    public static final int MAX_BATCH_FOR_IN_SQL_STATEMENT = 1000;
    
    //------------------------------------------------------------
    
	/** Константа сортировки по возрастанию "ASC" */ 
	public final static String ASC = "ASC";

	/** Константа сортировки по убыванию "DESC" */ 
	public final static String DESC = "DESC";

	//------------------------------------------------------------
	
	/** Константа пустого массива строк */ 
	public final static String[] EMPTY_ARRAY = new String[]{};

    //------------------------------------------------------------

	/** Константа выставленного флага */
	public static final byte FLAG_ON = 1;
}
