/*
 * 
 * 
 * primer operando  5
 * 
 * segundo operando 8
 * 
 * 
 * menu operador 
 * 
 * 1 suma 
 * 2 resta
 * 3 multi
 * 4 div
 * 
 * */

import java.util.Scanner;


public class calculadora{
	
	
	
	public static void main(String args[]){
		
		int opcion=0, primerOperando=0, segundoOperando=0;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("introduce primer operando");
		primerOperando=sc.nextInt();
		System.out.println("introduce segundo operando");
		segundoOperando=sc.nextInt();
		
		
		System.out.println();
		
		System.out.println("**** MENU ****");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicacion");
		System.out.println("4 - Division");
		
		System.out.println("introduce primer operando");
		opcion=sc.nextInt();
		
		switch(opcion){
			
			case 1: 
				System.out.printf("%d + %d = %d",primerOperando,segundoOperando,segundoOperando+primerOperando);
			break;
			
			case 2:
				System.out.printf("%d - %d = %d",primerOperando,segundoOperando,primerOperando-segundoOperando);
			break;
			
			
			case 3: 
			
				System.out.printf("%d X %d = %d",primerOperando,segundoOperando,primerOperando*segundoOperando);
			break;
			
			case 4:
				System.out.printf("%d / %d = %.2f",primerOperando,segundoOperando,(float)primerOperando/segundoOperando);
			break;
			
			
			default:
				System.out.printf("has entraod en default");
			break;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	}
