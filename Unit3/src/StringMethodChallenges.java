
public class StringMethodChallenges {
	public static void main( String[] arg ) {
		
		/*
The second half of [tester] is [ter]
[tester] backwards is [retset]
[              tester            ] with the spaces removed is [tester]
[tester] backwards in uppercase is [RETSET]
[tester] without [e] is [t st r]
The final 3 of [tester] and [tester] are the same: [true]
The final character of [test] occurs at the index of [this is the test] [0]
The second half of [this is the test] does begin with the final 2 characters of [is th] : [true]

		 */
		String chal1 = "tester";
		System.out.println( "The second half of [" + chal1 + "] is [" + secondHalf( chal1 ) + "]" );
		
		String chal2 = "tester";
		System.out.println( "[" + chal2 + "] backwards is [" + printBackwards( chal2 ) + "]" );
		
		String chal3 = "              tester            ";
		System.out.println( "[" + chal3 + "] with the spaces removed is [" + stripSpaces( chal3 ) + "]" );
		
		String chal4 = "tester";
		System.out.println( "[" + chal4 + "] backwards in uppercase is [" + upperBackwards( chal4 ) + "]" );
		
		String chal5a = "tester";
		String chal5b = "e";
		System.out.println( "[" + chal5a + "] without [" + chal5b + "] is [" + clean( chal5a , chal5b ) + "]" );
		
		String chal6a = "tester";
		String chal6b = "tester";
		System.out.println( "The final 3 of [" + chal6a + "] and [" + chal6b + "] are the same: [" + similarByFinal3( chal6a , chal6b ) + "]" );
		
		String chal7a = "this is the test";
		String chal7b = "test";
		System.out.println( "The final character of [" + chal7b + "] occurs at the index of [" + chal7a + "] [" + whereFinalOfstrBOccurs( chal7a , chal7b ) + "]" );
		
		
		String chal8a = "this is the test";
		String chal8b = "is th";
		System.out.println( "The second half of [" + chal8a + "] does begin with the final 2 characters of [" + chal8b + "] : [" + doesSecondHalfBeginWithstrBFinal2( chal8a , chal8b ) + "]" );
		
	}
	
	public static String secondHalf( String str ) {	// #1
		return str.substring( str.length() / 2 );
	}
	
	public static String printBackwards( String str ) {	// #2
		String str_Altered = "";
		for ( int letter = str.length() - 1; letter >= 0; letter-- ) {
			str_Altered = str_Altered + str.charAt( letter );
		}
		
		return str_Altered;
	}
	
	public static String stripSpaces( String str ) {	// #3
		/*
		 * 		String str_Altered = str;
		for ( int side = 0; side <= 1; side ++ ) {
			for ( int letter = 0; letter < 0; letter++ ) {
				if ( str_Altered.substring( letter , letter ).equals( " " ) ) {
					str_Altered.replace( str_Altered.charAt( letter ), ' ');
				}
			}
		}
		 */
		return str.trim();
	}
	
	public static String upperBackwards( String str ) {	// #4
		return printBackwards( str ).toUpperCase();
	}
	
	public static String clean( String strA , String strB ) {	// #5
		return strA.replace( strB , " " );
	}
	
	public static Boolean similarByFinal3( String strA , String strB ) {	// #6
		String strA_Final3 = strA.substring( strA.length() - 3 );
		String strB_Final3 = strB.substring( strB.length() - 3 );
		
		return strA_Final3.equals( strB_Final3 );
	}
	
	public static int whereFinalOfstrBOccurs( String strA , String strB ) {	// #7
		String strB_Final = strB.substring( strB.length() - 1 );
		
		return strA.indexOf( strB_Final );
	}
	
	public static boolean doesSecondHalfBeginWithstrBFinal2( String strA , String strB ) {	// #8
		String strA_SecondHalfFirst2 = strA.substring( strA.length() / 2 , ( strA.length() / 2 ) + 2 );
		return strA_SecondHalfFirst2.equals( strB.substring( strB.length() - 2 ) );
	}
	
}
