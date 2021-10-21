
public class ClassConstants {
	static final int SIZE = 6;
	
	
	public static void main( String[] arg ) {
		output1();
		output2();
	}
	
	public static void output1( ) {
		for ( int row = 0; row < ( SIZE / 2 ); row++ ) {
			for ( int xs = 0; xs < SIZE; xs++ ) {
				System.out.print( "x" );
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void output2( ) {
		for ( int row = 0; row < SIZE; row++ ) {
			for ( int xs = 0; xs < SIZE - row; xs++ ) {
				System.out.print( "x" );
			}
			for ( int os = 0; os < row; os++ ) {
				System.out.print( "o" );
			}
			System.out.println();
		}
		System.out.println();
	}
}
