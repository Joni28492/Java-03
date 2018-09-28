/*
 * 
 * 
 * 
 * 
 * tablas de verdad de & && | || ^
 * print f bool - %b
 * 
 * */
 
 
 public class tablaVerdad{
	 
	 
	 public static void main(String args[]){
		 
		 
		System.out.println(); 
			System.out.println("*************************************************");
		System.out.println();
		 
		System.out.printf("\tA\t|\tB\t|\tA && B  |\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, false, false && false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, true, false && true);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, false, true && false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, true, true && true);
		 
		System.out.println(); 
			System.out.println("*************************************************");
		System.out.println();
		 
		System.out.printf("\tA\t|\tB\t|\tA & B   |\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, false, false & false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, true, false & true);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, false, true & false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, true, true & true);
		 
		System.out.println(); 
			System.out.println("*************************************************");
		System.out.println();
		 
		System.out.printf("\tA\t|\tB\t|\tA || B  |\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, false, false || false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, true, false || true);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, false, true || false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, true, true || true);
		
		
				 
		System.out.println(); 
		System.out.println("*************************************************");
		System.out.println();
		
		System.out.printf("\tA\t|\tB\t|\tA | B   |\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, false, false | false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, true, false | true);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, false, true | false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, true, true | true);
		 
		 
		 		 
		System.out.println(); 
		System.out.println("*************************************************");
		System.out.println();
		
		
		
		System.out.printf("\tA\t|\tB\t|\tA ^ B   |\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, false, false ^ false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", false, true, false ^ true);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, false, true ^ false);
		System.out.printf("\t%b\t|\t%b\t|\t%b\n", true, true, true ^ true);
		
		System.out.println(); 
			System.out.println("*************************************************");
		System.out.println();
		
		System.out.printf("\tA\t|\t!A\t|\n");
		System.out.printf("---------------------------------\n");
		System.out.printf("\t%b\t|\t%b\t|\n", true, !true);
		System.out.printf("\t%b\t|\t%b\t|\n", false, !false);
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		}
	 

	 
}
