
public class LastLoops {

	public static void main(String[] arg) {
		to50From40();
		to40From50();
		xPlusxEquals2x();
		xTimesxMinusOneEqualsz();
		xPlusrowEqualsz();
	}
	
	public static void to50From40( ) {
		
		for ( int i = 0; i <= 10; i++ ) {
		
			System.out.print( ( 40 + i ) + " " );
			
		}
		
		System.out.println();
		
	}
	
	public static void to40From50( ) {
		
		for ( int i = 0; i <= 10; i++ ) {
		
			System.out.print( ( 50 - i ) + " " );
		
		}
		
		System.out.println();
		
	}
	
	public static void xPlusxEquals2x( ) {
		
		for ( int row = 1; row <= 10; row ++ ) {
			
			System.out.println( row + " + " + row + " = " + ( row + row ) );
			
		}
		
		System.out.println();
		
	}
	
	public static void xTimesxMinusOneEqualsz( ) {
		
		for ( int row = 0; row < 10; row ++ ) {
			
			System.out.println( ( 10 - row ) + " * " + ( ( 10 - row ) - 1 ) + " = " + ( ( 10 - row ) * ( ( 10 - row ) -1 ) ) );
		
		}
		
	}
	
	public static void xPlusrowEqualsz( ) {
		
		for ( int row = 0; row < 10; row ++ ) {
			
			System.out.println( ( 10 - row ) + " + " + ( row + 1 ) + " = " + ( ( 10 - row ) + ( row + 1 ) ) );
		
		}
	
	}
	
}
