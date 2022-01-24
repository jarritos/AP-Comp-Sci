public class MTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tenByTenTable = { 	{1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10} ,
									{2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 , 20} ,
									{3 , 6 , 9 , 12 , 15 , 18 , 21 , 24 , 27 , 30} ,
									{4 , 8 , 12 , 16 , 20 , 24 , 28 , 32 , 36 , 40} ,
									{5 , 10 , 15 , 20 , 25 , 30 , 35 , 40 , 45 , 50} ,
									{6 , 12 , 18 , 24 , 30 , 36 , 42 , 48 , 54 , 60} ,
									{7 , 14 , 21 , 28 , 35 , 42 , 49 , 56 , 63 , 70} ,
									{8 , 16 , 24 , 32 , 40 , 48 , 56 , 64 , 72 , 80} ,
									{9 , 18 , 27 , 36 , 45 , 54 , 63 , 72 , 81 , 90} ,
									{10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100} 	};
		
		for ( int num = 0; num < 10; num++ ) {
			if ( num < 1 ) { // prints top border
				System.out.println( "________________________________________________________________________________" );
			}else if ( num < 2 ) { // prints inside border
				System.out.println( "|	________________________________________________________________________|" );
			}
			
			for ( int Snum = 0; Snum < 10; Snum++ ) {
				if ( Snum < 1 ) {// prints | before every number on the first column
					System.out.print( "|" ); 
				}else if ( Snum < 2 && num != 0 ) { // prints | after every first number on the first column excluding the first row
					System.out.print( "|" );
				}
				System.out.print( tenByTenTable[num][Snum] + "	" ); // prints out numbers evenly spaced
				if ( Snum == 9 ) { // prints | at the end of every row
					System.out.print( "|" );
				}
			}
			System.out.println();
			if ( num == 9 ) { // prints bottom border
				System.out.print( "|_______________________________________________________________________________|" );
			}
		}
	}

}
