
public class Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eat( "cupcake" );
		writeLetters( "=" , 30 );
	}
	
	public static void writeLetters( String text, int num ) {
		for ( int letter = 0; letter < num; letter++ ) {
			System.out.print( text );
		}
	}
	
	public static void eat( String food ) {
		System.out.print( "eating a " + food);
	}
}
