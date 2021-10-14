package test;

public class RocketLab {

	public static void main(String[] args) {
		drawFlag();
		drawTriangle();
		drawBox();
		drawFireTop();
		drawFireBottom();
		
	}
	
	public static void drawFlag( ) {
		System.out.print(
					" ___\n"
				+	"|{ |\n"
				+	"|__|\n"
				+	"   |\n"
				);
	}
	
	public static void drawLine( ) {
		System.out.print("______");
	}
	
	public static void drawDiagonalLines( ) {
		System.out.print(
					"   /\\\n"
				+	"  /  \\\n"
				+	" /    \\\n"
			);
	}
	
	public static void drawBoxBody( ) {
		System.out.print(
				"\n|      |\n"
			+ 	  "|      |\n"		
			+ 	  "|      |\n"
			+	  "|"
			);
	}
	
	public static void drawFireTop( ) {
		System.out.print(
					"\\     /\n"
				);
	}
	
	public static void drawFireBottom( ) {
		System.out.print(
					" /   \\\n"
				+	"//\\/\\\\"
				);
	}
	
	public static void drawBox( ) {
		System.out.print(" ");
		drawLine();
		drawBoxBody();
		drawLine();
		System.out.print("|\n");
	}
	
	public static void drawTriangle( ) {
		drawDiagonalLines();
		System.out.print( "/" );
		drawLine();
		System.out.print("\\\n");
	}
}
