
public class SpaceNeedle {
	static final int SIZE = 4;

	public static void main(String[] args) {

		  stem();
		  up();
		  seam();
		  down();
		  stem();
		//  body();
		  up();
		  seam();
		 

	}
	
	public static void down( ) {
		String arrow = "/\\";
		for ( int row = 1; row <= SIZE; row++ ) {
			for ( int spaces = 0; spaces < ( row - 1)*2; spaces++ ) {
				System.out.print( " " );
			}
			System.out.print( "\\_" );
			
			/*
			 * 	row	arrows
			 * 	1	11
			 * 	2	9
			 * 	3	7
			 * 	4	5
			 * 
			 * 	row	arrows
			 * 	1	13	(6)
			 * 	2	11	(5)
			 * 	3	9	(4)
			 * 	4	7	(3)
			 * 	5	5	(2)
			 */
			for ( int arrows = 0; arrows < SIZE + 1 + ( SIZE*2 - row*2 ); arrows++ ) {
				System.out.print( arrow );
			}
			System.out.print( "_/" );
			System.out.println();
		}
	}

	public static void stem( ) {
		for ( int row = 1; row <= SIZE; row++ ) {
			for ( int spaces = 0; spaces < SIZE * 3; spaces++ ) {
				System.out.print( " " );
			}
			System.out.println( "||" );
		}
	}
	
	public static void up( ) {
		for ( int row = 1; row <= SIZE; row++ ) {
			for ( int spaces = SIZE * 3; spaces > row * 3; spaces-- ) {
				System.out.print( " " );
			}
			System.out.print( "__/" );
			for ( int colons = 0; colons < ( row - 1 ) * 3; colons++ ) {
				System.out.print( ":" );
			}
			System.out.print( "||" );
			for ( int colons = 0; colons < ( row - 1 ) * 3; colons ++ ) {
				System.out.print( ":" );
			}
			System.out.print( "\\__" );
			System.out.println();
		}
	}
	
	public static void seam( ) {
		System.out.print( "|" );
		for ( int star = 0; star < SIZE*6; star++ ) {
			System.out.print( "*" );
		}	
		System.out.println( "|" );
	}
}
