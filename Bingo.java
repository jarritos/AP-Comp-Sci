import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Bingo {
	static final Random RAND = new Random();
	static final Scanner INPUT = new Scanner(System.in);
	static final String[] BINGO = { "B" , "I" , "N" , "G" , "O" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = initBingo();
		boolean[] called = new boolean[75];
		/* board[letter/row][number/column]
		 * 
		 * 	_ _ _ _ _
		 *  _ _ _ _ _
		 *  _ _ _ _ _
		 *  _ _ _ _ _
		 *  _ _ _ _ _
		 */
		printBoard( board );
		
		while ( true ) {
			INPUT.nextLine();
			int[] activeCalled = call();
			while ( called[activeCalled[1] - 1] ) {
				System.out.println( "Previous number has been called, recalling ..." );
				activeCalled = call();
			}
			called[activeCalled[1] - 1] = true;
			for ( int row = 0; row < 5; row++ ) {
				if ( board[activeCalled[0]][row] == activeCalled[1] ) {
					System.out.println( "You got a number !" );
					board[activeCalled[0]][row] = 0;
				}
			}
			INPUT.nextLine();
			printBoard( board );
			if ( status(board) ) {
				System.out.println( "You win !!\nNew game" );
				board = initBingo();
				for ( int i = 0; i < called.length; i++ ) {
					called[i] = false;
				}
			}
		}
		
	}
	
	public static boolean status( int[][] board ) {
		for ( int row = 0; row < 5; row++ ) { 
			boolean[] status = new boolean[5];
			for ( int rowCheck = 0; rowCheck < 5; rowCheck++ ) {
				status[rowCheck] = board[row][rowCheck] == 0;
			}
			return  status[0] == true && 
					status[1] == true && 
					status[2] == true && 
					status[3] == true && 
					status[4] == true;
		}
		
		for ( int column = 0; column < 5; column++ ) {
			boolean[] status = new boolean[5];
			for ( int row = 0; row < 5; row++ ) {
				status[row] = board[row][column] == 0;
			}
			System.out.println("a"
					+ "CS0_" + column + status[0] == true);
			return  status[0] == true &&
					status[1] == true &&
					status[2] == true &&
					status[3] == true &&
					status[4] == true;
		}
		return false;
	}
	
	public static int pickNumber( int min , int max ) {
		return min + RAND.nextInt( ( max - min ) + 1 );
	}
	
	public static int[] call( ) {
		int letter = RAND.nextInt( 5 );
		int num = pickNumber( (letter+1)*15 - 14 , (letter+1)*15 );
		System.out.println( BINGO[letter] + "_" + num + " [ L:" + letter + " | N:" + num + " ]" );
		return new int[] { letter , num } ;
	}
	
	public static void printBoard( int[][] board ) {
		System.out.println( "\n\n\n\n\n\n\n\n\n\n._______________________________________." );
		for ( int i = 0; i < 5; i++ ) {
			System.out.print( "|   " + BINGO[i] + "	");
		}
		System.out.println("|\n"
				+ "|_______|_______|_______|_______|_______|");
		for ( int row = 0; row < 5; row++ ) {
			for ( int column = 0; column < 5; column++ ) {
				System.out.print( "|   " + board[column][row] + "	" );
			}
			System.out.println("|\n"
					+ "|	|	|	|	|	|\n"
					+ "|_______|_______|_______|_______|_______|");
		}
		
	}
	
	public static int[][] initBingo( ) {
		int[][] used = new int[5][5];
		int[][] board = new int[5][5];
		for ( int letter = 1; letter <= 5; letter++ ) {
			for ( int row = 1; row <= 5; row++ ) {
				int num = pickNumber( letter*15 - 14 , letter*15 );
				//System.out.println( "num is " + num );
				for ( int check = 0; check < 5; check++ ) {
					while ( used[letter - 1][check] == num ) {
						System.out.println( "used[" + ( letter - 1 )  + "][" + check + "] is " + used[letter - 1][check] + " | num was " + num);
						num = pickNumber( letter*15 - 14 , letter*15 );
						System.out.println( "num is now " + num );
						
					}
				}
				used[letter - 1][row - 1] = num;
				board[letter - 1][row - 1] = num;
				board[2][2] = 0;
				
			} 
		}
		
		return board;
		
	}

}
