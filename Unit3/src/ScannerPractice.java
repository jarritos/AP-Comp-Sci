import java.util.Scanner;

public class ScannerPractice {
	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println( interview() );
		favoriteSquare(); 
	}
	
	public static String interview( ) {
		String[] questions = { "What is your name? " , "Where are you from? " , "What do you like to do? " };
		String[] answers = { "" , "" , "" };
		
		for ( int question = 0; question < 3; question++ ) {
			System.out.print( questions[ question ] );

			answers[ question ] = INPUT.nextLine();
			
		}
		
		return answers[ 0 ] + " is a person from " + answers[ 1 ] + " who likes to " + answers[ 2 ];
		
	}
	
	public static void favoriteSquare( ) {
		System.out.println( "What is your favorite letter? " );
		String answerA = INPUT.nextLine();
		
		System.out.println( "What is your favorite number? " );
		int answerB = INPUT.nextInt();
		
		for ( int column = 0; column < answerB; column++ ) {
			
			for ( int row = 0; row < answerB; row++ ) {
				
				System.out.print( answerA + " " );
				
			}
			
			System.out.println();
			
		}
		
	}

}
