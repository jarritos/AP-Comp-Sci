
public class ForLoopsChallenges2 {

	public static void main(String[] args) {
		zeroToNineForward();
		zeroToNineBackward();
		zeroToTwentieEvenForward();
		zeroToTwentieEvenBackward();
		oneToTwentieOddForward();
		oneToTwentieOddBackward();
		countDownFrom100Forward();
		countDownFrom100Backward();
		countDownFrom100EvenForward();
		countDownFrom100EvenBackward();
	}
	
	public static void zeroToNineForward( ) {
		for ( int i = 0; i <= 9; i++ ) {
			System.out.print( i + " " );
		}
		System.out.println();
	}
	
	public static void zeroToNineBackward( ) {
		int num = 0;
		for ( int i = 0; i <= 9; i++ ) {
			System.out.print( num + " " );
			num += 1;
		}
		System.out.println();
	}
	
	public static void zeroToTwentieEvenForward( ) {
		for ( int i = 0; i <= 20; i += 2 ) {
			System.out.print( i + " " );
		}
		System.out.println();
	}
	
	public static void zeroToTwentieEvenBackward( ) {
		int num = 0;
		for ( int i = 0; i <= 10; i++ ) {
			System.out.print( num + " " );
			num += 2;
		}
		System.out.println();
	}
	
	public static void oneToTwentieOddForward( ) {
		for ( int i = 1; i <= 21; i += 2 ) {
			System.out.print( i + " " );
		}
		System.out.println();
	}
	
	public static void oneToTwentieOddBackward( ) {
		int num = 1;
		for ( int i = 0; i <= 10; i++ ) {
			System.out.print( num + " " );
			num += 2;
		}
		System.out.println();
	}

	public static void countDownFrom100Forward( ) {
		for ( int i = 100; i >= 0; i-- ) {
			System.out.print( i + " " );
		}
		System.out.println();
	}
	
	public static void countDownFrom100Backward( ) {
		int num = 100;
		for ( int i = 0; i <= 100; i++ ) {
			System.out.print( num + " " );
			num--;
		}
		System.out.println();
	}
	
	public static void countDownFrom100EvenForward( ) {
		for ( int i = 100; i >= 0; i -= 2 ) {
			System.out.print( i + " " );
		}
		System.out.println();
	}
	
	public static void countDownFrom100EvenBackward( ) {
		int num = 100;
		for ( int i = 0; i <= 50; i++ ) {
			System.out.print( num + " ");
			num -= 2;
		}
		System.out.println();
	}
}
