import java.util.Scanner;

public class Ifelse {
	static final String[][] MOVIES = 	{ 
			{ "Clifford the Big Red Dog" , "Free Guy" , "Palm Springs" } , // Comedy { Kids , Teens , Adult }
			{ "Coraline" , "Old" , "Candyman" } , //Horror { Kids , Teens , Adult }
			{ "Race to Witch Mountain" , "Shang-Chi " , "Deadpool" } // Action { ... }
										}; 
	static final String[] GENRES = { "Comedy" , "Horror" , "Action" };
	static final int[][] AGES = { { 0 , 12 } , { 13 , 17 } , { 18 , 100 } };
	static final Scanner INPUT = new Scanner(System.in);
	static int age;
	static String name;
	static String preference;
	
	public static void main( String[] arg ) {
		getName();
		getAge();
		getGenrePreference();
		System.out.print( name + ", you should watch " + findMovie() + " !" );
	}
	
	public static String findMovie( ) {
		for ( int genre = 0; genre < 3; genre++ ) {
			//System.out.println( "genre : " + genre + " [" + preference + " , " + GENRES[genre] + "]" );
			if ( preference.equalsIgnoreCase(GENRES[genre]) ) {
				//System.out.println( "genre found" );
				for ( int ageGroup = 0; ageGroup < 3; ageGroup++ ) {
					//System.out.println( "age group : " + ageGroup );
					if ( age > AGES[ageGroup][0] && age < AGES[ageGroup][1] ) {
						//System.out.println( "age group found");
						return MOVIES[genre][ageGroup];
					}
				}
			}
		}
		
		return "Couldn't find movie";
	}
	
	public static void getAge( ) {
		System.out.println( "What is your age ?" );
		age = INPUT.nextInt();
		INPUT.nextLine();
		
		if ( age < 0 ) {
			System.out.println( "hahahah goodbye " );
		}
	}
	
	public static void getName( ) {
		System.out.println( "What is your name ?" );
		name = INPUT.nextLine();
		
		if ( name.length() > 8 ) {
			name = name.substring( 0 , 8 );
		}
	}
	
	public static void getGenrePreference( ) {
		System.out.println( "Which do you prefer: Comedy, Horror, or Action movies ?" );
		preference = INPUT.nextLine();
	}
}
