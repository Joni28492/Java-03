/*
Escribir una aplicación que un JTextArea en un cuadro de dialogo, nos muestre la tabla de 
multiplicar del 1 al 10.
*/

import javax.swing.*;

public class ejercicio10{
	
	
	public static void main(String args[]){
		
		JTextArea areaSalida= new JTextArea(50,50);
		JScrollPane scrollPane= new JScrollPane(areaSalida);
		
		int i=0, j=0;
		
		
		for(i=0;i<=10;i++){
			
				areaSalida.append("Tabla del "+i+"\n\n");
				
				for(j=0;j<=10;j++){
					
				areaSalida.append(i+" X "+j+" = "+(i*j)+"\n");	
					
					
				}
			
			
		areaSalida.append("\n");
			
		}
		
		
		JOptionPane.showMessageDialog(null,scrollPane, "Tablas de multiplicar", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
