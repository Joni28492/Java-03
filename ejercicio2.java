/*Escribir una aplicación que calcule el producto de los enteros impares del 1 al 15, y que muestre los 
resultados en un cuadro de diálogo de mensaje.
Resultado:
1 * 3 * 5 * 7 * 9 * 11 * 13 * 15 = 2027025
* */

public class ejercicio2{
	
	
	
	
	public static void main(String args[]){
		
		int resultado=1, i=0;
		
		for(i=1;i<=15;i+=2){
			
				
			resultado*=i;

		}
		
		System.out.printf("el resultado es %d", resultado);
		

		
	}

}
