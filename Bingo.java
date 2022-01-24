import java.util.Random;
import java.util.Scanner;
public class Bingo {
	static final Random RAND = new Random();
	static final Scanner INPUT = new Scanner(System.in);
	static final String[] BINGO = { "B" , "I" , "N" , "G" , "O" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = initBingo();
		printBoard( board );
		while (INPUT.nextLine().equals("next") ) {
			call();
			
		}
	}
	
	
	public static int pickNumber( int min , int max ) {
		return min + RAND.nextInt( ( max - min ) + 1 );
	}
	
	public static String call( ) {
		int letter = RAND.nextInt( 5 );
		int num = pickNumber( letter*15 - 14 , letter*15 );
		
		return BINGO[letter] + "-" + num;
	}
	
	public static void printBoard( int[][] board ) {
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
						//System.out.println( "used[" + ( letter - 1 )  + "][" + check + "] is " + used[letter - 1][check] + " | num was " + num);
						num = pickNumber( letter*15 - 14 , letter*15 );
						//System.out.println( "num is now " + num );
						
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
