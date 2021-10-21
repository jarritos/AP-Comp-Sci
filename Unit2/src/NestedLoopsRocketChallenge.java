
public class NestedLoopsRocketChallenge {
	static final int SIZE = 9;

	public static void main( String[] args ) {
		cone();
		seam();
		bodyA();
		bodyB();
		seam();
		bodyB();
		bodyA();
		seam();
		cone();
	}
	
	public static void bodyB( ) {
		String arrow = "\\/";
		for ( int row = 1; row <= SIZE; row ++ ) {
			System.out.print( "|" );
			for ( int dots = 1; dots < row; dots++ ) {
				System.out.print( "." );	
			}
			for ( int arrows = SIZE; arrows >= row; arrows-- ) {
				System.out.print( arrow );	
			}
			for ( int dots = 1; dots < row*2 - 1; dots++ ) {
				System.out.print( "." );
			}
			for ( int arrows = SIZE; arrows >= row; arrows-- ) {
				System.out.print( arrow );	
			}
			for ( int dots = 1; dots < row; dots++ ) {
				System.out.print( "." );	
			}
			System.out.print( "|" );
			System.out.println();	
		}
	}
	
	public static void bodyA( ) {
		String arrow = "/\\";
		for ( int row = 1; row <= SIZE; row++ ) {
			System.out.print( "|" );
			for ( int dots = SIZE; dots > row; dots-- ) {
				System.out.print( "." );	
			}
			for ( int arrows = 0; arrows < row; arrows++ ) {
				System.out.print( arrow );	
			}
			for ( int dots = SIZE*2; dots > row*2; dots-- ) {
				System.out.print( "." );	
			}
			for ( int arrows = 0; arrows < row; arrows++ ) {
				System.out.print( arrow );	
			}
			for ( int dots = SIZE; dots > row; dots-- ) {
				System.out.print( "." );	
			}
			System.out.print( "|" );
			System.out.println();	
		}
	}
	
	public static void cone( ) {
		for ( int row = 1; row < SIZE * 2; row++ ) {
			for ( int spaces = SIZE * 2; spaces >= row + 1; spaces-- ) {
				System.out.print( " " );	
			}
			for  ( int slashesR = 1; slashesR <= row; slashesR++ ) {
				System.out.print( "/" );	
			}
			System.out.print( "**" );
			for ( int slashesL = 1; slashesL <= row; slashesL++ ) {
				System.out.print( "\\" );
			}
			System.out.println();
		}
	}
	
	public static void seam( ) {
		String thing = "-*";
		System.out.print( "+" );
		for ( int things = 1; things <= SIZE * 2; things++ ) {
			System.out.print(thing);
		}
		System.out.print("+");
		System.out.println();
	
	}
}
