/*Escriba una aplicación que encuentre el menor de varios enteros. Suponga que el
primer valor leído especifica el número de valores que el usuario va a introducir*/

import java.util.Scanner;


public class ejercicio1{
	
	
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		int numeros=0, i=0,valor=0, menor=Integer.MAX_VALUE;
		
		System.out.println("introduce cantidad de numeros");
		numeros=sc.nextInt();
		
		
			for(i=1;i<=numeros;i++){
				
				System.out.println("introduce  numero");
				valor=sc.nextInt();
				if(valor<menor) menor=valor;
					
				
				
			}
		
		System.out.printf("el menor es %d", menor);
		

		
		}
	
	




}
