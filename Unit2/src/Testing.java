
public class Testing {

	public static void main(String[] args) {
		
	}
	
	public static void x3( ) {
		for ( int row = 0; row < 3; row++ ) {
			for ( int xs = 0; xs < 6; xs++ ) {
				System.out.print("x");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void x6o( ) {
		for ( int row = 0; row < 6; row++ ) {
			for ( int xs = 0; xs < 6 - row; xs++ ) {
				System.out.print("x");
			}
			for ( int os = 0; os < row; os++ ) {
				System.out.print("o");
			}
			System.out.println();
		}
	}

}
