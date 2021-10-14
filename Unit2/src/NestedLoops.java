
public class NestedLoops {

	public static void main(String[] args) {
		//Problem 1:
		
		for ( int row = 0; row < 2; row++ ) {
			
			for ( int symbol = 0; symbol < 7; symbol++ ) {
			
				System.out.print( "@" );
			
			}
			
			System.out.println();
			
		}
		
		//Problem 2:
		
		for ( int row = 0; row < 5; row++ ) {
			
			for ( int symbol = 0; symbol < row + 1; symbol++ ) {
				
				System.out.print( "@" );
				
			}
			
			System.out.println();
			
		}
		
		//Problem 3:
		
		for ( int row = 0; row < 9; row++ ) {
			
			for ( int num = 1; num <= row + 1; num++ ) {
				
				System.out.print( num + " " );
				
			}
			
			System.out.println();
			
		}
		
		//Problem 4:
		
		for ( int row = 0; row < 9; row++ ) {
			
			for ( int num = 1; num <= 9 - row; num++ ) {
				
				System.out.print( num + " " );
				
			}
			
			System.out.println();
			
		}
		
		//Problem 5:
		
		for ( int row = 0; row < 7; row++ ) {
			
			for ( int num = 1; num <= row + 1; num++ ) {
				
				System.out.print( row + 1 );
				
			}
			
			System.out.println();
			
		}
		
		//Problem 6:
		
		for ( int row = 0; row < 5; row++ ) {
			
			for ( int num = 1; num < 5 - ( row ); num++ ) {
				
				System.out.print( " " );
				
			}
			
			System.out.print( row + 1 );
			System.out.println(); 
			
		}
		
		//Problem 7:
		
		for ( int row = 0; row < 2; row++ ) {
			
			for ( int num = 0; num < 10; num++ ) {
				
				for ( int place = 0; place < 4; place++ ) {
					
					System.out.print( num );
					
				}
				
			}
			
			System.out.println();
			
		}
		
		
		/*
		 * 	row	x
		 * 	0	1
		 * 	1	3
		 * 	2	5
		 * 	3	7
		 */
		//Problem 8:
		
		for ( int row = 0; row < 4; row++ ) {
			
			for ( int spaces = 4; spaces > row; spaces-- ) {
				
				System.out.print( "  " );
			}
			
			for ( int xs = 1; xs <= ( row * 2 ) + 1; xs++ ) {
				
				System.out.print( "x ");
				
			}
			
			System.out.println();
			
		}
		
		//Problem 9:
		
		/*
		 * 	row	dashes	num
		 * 	0	5		1
		 * 	1	4		3
		 * 	2	3		5
		 * 	3	2		7
		 * 	4	1		9
		 */
		
		for ( int row = 0; row < 5; row++ ) {
			
			for ( int dashes = 5; dashes > row; dashes-- ) {
				
				System.out.print( "-" );
			
			}
			
			for ( int num = 0; num < ( row * 2 ) + 1; num++ ) {
				
				System.out.print( ( row * 2 ) + 1 );
				
			}
			
			for ( int dashes = 5; dashes > row; dashes-- ) {
				
				System.out.print( "-" );
			
			}
			
			System.out.println();
			
		}

	}

}
