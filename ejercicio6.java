/*
 * Escriba una aplicación que imprima una tabla con los cuadrados de los números decimales, en el 
rango de 1 al 256. Coloque los resultados en un objeto JTextArea con funcionalidad de 
desplazamiento. Muestre el objeto JTextArea en un cuadro de diálogo de mensaje
* 
* 
* 1^2   2^2  3^2
* */
import javax.swing.*;
import java.lang.*;

public class ejercicio6{
	
	
	
		public static void main(String args[]){
		
		JTextArea areaSalida = new JTextArea(50,50);
		JScrollPane scrollPane= new JScrollPane(areaSalida);
		 
		int i=0;
		
			for(i=1; i<=256;i++){
				
				
					areaSalida.append("\t"+i+"^2 = "+ Math.pow(i,2)+"\n");
				
				
				
			}
			
			
			//añadir scroll
			JOptionPane.showMessageDialog(null,scrollPane, "ejercicio 6", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			
		
		
		
		
		
		
		
		}
	

	
}
