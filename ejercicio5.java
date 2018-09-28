/*
 * 
 * Una aplicación interesante es dibujar histogramas, escribir un programa que lea 5 números entre el 
1 y el 30. Por cada número leído, su programa debe dibujar ese número de asteriscos adyacentes.
Ej: 5, 3, 6, 1
*****
***
******
*
* */

import java.util.Scanner;



public class ejercicio5{
	
	
		public static void main(String args[]){
		
		
		int i=0,j=0, numero=0;
		String[] valores=new String[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<5;i++){
			
				
				do{
					System.out.println("\nintroduce numero entre 1 y 30");
					numero=sc.nextInt();
					}while(numero<1 || numero>30);
				
				//valores[i] =Integer.toString(numero);
				valores[i] =String.valueOf(numero);
				System.out.printf("\nposicion %d valor =  %d\n", i, Integer.parseInt(valores[i]));
				
		}
		
		System.out.println();


		for(i=0;i<5;i++){
			
			
				for(j=1; j<=Integer.parseInt(valores[i]); j++){
					
					System.out.print("*");
					
				}
			
			
			System.out.println();
			
			
		}
		
		

		
		
		}//fin main
	

}
