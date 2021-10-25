
public class ParametersAssignment { 
	public static void main( String[] arg ) {
		greet( "Jason" );
		multiplyOutLoud( 2, 3 );
		writeLetters( "=" , 30 );
		timeTable( 2 , 5 );
	}
	
	public static void greet( String name ) {
		System.out.println( "hi ! " + name );
	}
	
	public static void multiplyOutLoud( int first , int second ) {
		System.out.println( "When you multiply " + first + " and " + second + " you get " + ( first * second ) );
	}
	
	public static void writeLetters( String text , int num ) {
		for ( int letter = 0; letter < num; letter++ ) {
			System.out.print( text );
		}
		
		System.out.println();
	}
	
	public static void timeTable( int base , int last ) {
		for ( int row = 1; row <= last; row++ ) {
			multiplyOutLoud( base , row );
		}
	}
}
