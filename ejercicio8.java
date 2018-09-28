/*
Escriba una aplicación que pida un número y según ese número el valor que tome imprima la 
correspondiente figura:
1)
**********
*        *
*        *
*        *
**********
2)
    *
   * *
  *   *
 *     *
*********
3)
*********
*
*
*
*********
Cualquier otro:
"Ha elegido cualquier otro valor"
*/
import java.util.Scanner;


public class ejercicio8{
	
	
	
		public static void main(String args[]){
		
		
			int n=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce numero");
			n=sc.nextInt();
			
			
			switch(n){
				
				case 1:
				System.out.println("**********");
				System.out.println("*        *");
				System.out.println("*        *");
				System.out.println("*        *");
				System.out.println("**********");
				break;
				
				
				
				
				case 2:
				System.out.println("    *");
				System.out.println("   * *");
				System.out.println("  *   *");
				System.out.println(" *     *");
				System.out.println("*********");
				
				break;
				
				case 3:
				
				System.out.println("**********");
				System.out.println("*");
				System.out.println("*");
				System.out.println("*");
				System.out.println("**********");
				
				
				break;
				
				default:
				System.out.println("Ha elegido cualquier otro valor");
				
				break;
				

			
			}
		
		
		
		
		
		
		
		
		
		
		
		}

	
}
