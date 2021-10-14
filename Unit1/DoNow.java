package test;

public class DoNow {

	public static void main(String[] args) {
		drawSquare();
	}
	
	public static void drawRow( ) {
		System.out.println( "* * * * *" );
	}
	
	public static void drawSquare( ) {
		drawRow();
		drawRow();
		drawRow();
		drawRow();
		drawRow();
	}

}
