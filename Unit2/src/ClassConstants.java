
public class ClassConstants {
	static int size = 6;
	
	public static void main( String[] arg ) {
		output1();
		output2();
	}
	
	public static void output1( ) {
		for ( int row = 0; row < ( size / 2 ); row++ ) {
			for ( int xs = 0; xs < size; xs++ ) {
				System.out.print( "x" );
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void output2( ) {
		for ( int row = 0; row < size; row++ ) {
			for ( int xs = 0; xs < size - row; xs++ ) {
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
