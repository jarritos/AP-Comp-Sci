
public class DoNow {

	public static void main(String[] args) {
		String str = "Prowess";
		for ( int row = 0; row <= str.length() - 3; row++ ) {
			System.out.print( str.substring( row , row + ( 3 ) ) );
			System.out.println();
		}
		
	}

}
