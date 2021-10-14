package test;

public class JavaMathOperations {

	public static void main(String[] args) {
		System.out.println("\nA\n__");	
		//A	[	15	8	3	%	+	]
		System.out.println(15 % 8);		//	7
		System.out.println(15 % 3);		//	0
		System.out.println(8 % 3);		//	2
		System.out.println(8 + 3);		//	11
		System.out.println(8);			//	8
		System.out.println(8 % 3 + 15);	//	17
		System.out.println(15 + 3);		//	18
		
		System.out.println("\nB\n__");	
		//B	[	9	5	4	*	/	]	
		System.out.println(9 / 4);		//	2
		System.out.println(4 * 9);		//	36
		System.out.println(4 / 5 * 9);	//	0
		System.out.println(5 / 4);		//	1
		System.out.println(9 * 5);		//	45
		System.out.println(4);			//	4
		System.out.println(9 * 5 / 4);	//	11
		
		System.out.println("\nC\n__");		
		//C	[	10	2	3	%	-	]
		System.out.println(2 - 3);			//	-1
		System.out.println(10 % 2);			//	0
		System.out.println(10 - (3 - 2));	//	9
		System.out.println(3 - 2);			//	1
		System.out.println(2);				//	2
		System.out.println((3 - 2) - 10);	//	-9
		System.out.println(10 % 2 - 3);		//	-3
		
		System.out.println("\nD\n__");	
		//D	[	18	3	7	/	+	]
		System.out.println(3 / 7);		//	0
		System.out.println(18 / 7 + 3);	//	5
		System.out.println(7);			//	7
		System.out.println(7 / 3 + 18);	//	20
		System.out.println(18 + 3);		//	21
		System.out.println(18 / 3 + 7);	//	13
		System.out.println(18);			//	18
		
		System.out.println("\nE\n__");	
		//E	[	0	4	14	%	+	]
		System.out.println(14 % 4);		//	2
		System.out.println(4);			//	4
		System.out.println(0);			//	0
		System.out.println(14);			//	14
		System.out.println(14 + 4);		//	18
		System.out.println(4 % 0);		//	error!

	}

}
