/**
 * 
 * 
 * 
 * prueba switch
 * 
 * 
 * 
 * */
 
 import java.util.Scanner;


public class PruebaSwitch{
	
	
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			int opcion=0;
			
			System.out.println("**** MENU ****");
			System.out.println();
			System.out.println("1 - Mensaje Bonito");
			System.out.println("2 - Mensaje feo");
			System.out.println("3 - Mensaje soso");
			System.out.print("elige uno de los mensajes anteriores");
			
			opcion=sc.nextInt();
			
			
			switch(opcion){
				
				
				
				case 1:
					System.out.println("hoy cobras extra");
				
					break;
				
				
				case 2:
				
					System.out.println("despedido por inutil");
				
					break;
				
				
				case 3:
				
					System.out.println("sigue trabajando");
				
					break;
				
				
				default:
					System.out.println("has entrado en default");
					break;
				
				}

			
			
			
			
			
			
			
			
		}
	

}
