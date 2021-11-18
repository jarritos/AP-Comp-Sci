
public class Slopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSlopeIntercept( 1 , 2 , 8 , 8 );
	}
	
	public static String fraction( int nume , int deno ) {
		return nume +  "/" + deno;
	}
	
	public static String point( int x , int y ) {
		return "(" + x + "," + y + ")";
	}
	
	public static void printSlope( int x1 , int y1 , int x2 , int y2 ) {
		System.out.print( "The slope between " + point( x1 , y1 ) + point( x2 , y2 ) + " is " + fraction( y2 - y1 , x2 - x1 ) );
	}
	
	public static void printSlopeIntercept( int x1 , int y1 , int x2 , int y2 ) {
		System.out.print( "y = " + ( y2 - y1 ) + "/" + ( x2 - x1 ) + "x + " + ( y1 - ( ( ( (double) y2 - y1 ) / ( x2 - x1 ) ) * x1 ) ) );
	}

}
