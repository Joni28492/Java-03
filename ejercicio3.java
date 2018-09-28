/*Escribe una aplicación que evalúe los factoriales de los enteros del 1 al 5.
Muestre los resultados en formato tabular, en un objeto JTextArea que aparezca en un cuadro de 
diálogo de mensaje
* */

import javax.swing.*;
import java.util.Scanner;


public class ejercicio3{
	
	
	
	public static int factorial(int numero, JTextArea areaSalida){
		
		areaSalida.append("\t!"+numero);
		
		if(numero==0)	
			return 1;
		
		else 
			return numero*factorial(numero-1, areaSalida);
		
		
		
	}
	
	
	
	public static void main(String args[]){
		
		JTextArea areaSalida= new JTextArea();
		Scanner sc= new Scanner(System.in);
		int numero=0;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog(null, "introduce numero"));
		
		
		
		
		areaSalida.append("\t=> el factorial es\t"+factorial(numero, areaSalida));
		
		JOptionPane.showMessageDialog(null, areaSalida);
		
		
		
		
		
		
		
		
		
		
		
	}

}
