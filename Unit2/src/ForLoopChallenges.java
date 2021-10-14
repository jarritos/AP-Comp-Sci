
public class ForLoopChallenges {

	public static void main(String[] args) {
		for ( int i = 1; i <= 100; i++ ) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		
		for ( int i = 10; i <= 100; i += 10 ) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		
		for ( int i = 200; i >= 190; i -= 1 ) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		
		for ( int i = 10; i >= 0; i -= 2 ) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		
		for ( int i = 1; i <= 5; i++ ) {
			System.out.println( "2 * " + i + " = " + (2 * i) );
		}
		
		System.out.print( "I" );
		
		for ( int i = 1; i <= 6; i++ ) {
			System.out.print( " really" );
		}
		
		System.out.print( " like you" );
	}

}
