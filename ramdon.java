/*
pedir una cantidad de numeros
mostrar numeros aleatorios
cuantos pares y cuantos impares
*/
import javax.swing.*;
import java.lang.*;

public class ramdon{
	
	
	
	public static void main(String args[]){
		
		int cantidadNumeros=0, numeroAleatorio=0, par=0, impar=0, i=0;
		JTextArea areaSalida= new JTextArea(50,50);
		JScrollPane scrollPane= new JScrollPane(areaSalida);
		
		cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce cantida de numeros"));
		
		for(i=1;i<=cantidadNumeros;i++){
			
			numeroAleatorio=(int)(Math.random()*2)+1;
			areaSalida.append("numero "+i+"=> "+numeroAleatorio+"\n");
			if(numeroAleatorio%2==0) par++;
			else impar++;
			
			
			
			
			
			
		}
		
		areaSalida.append("\n tienes "+par+" numeros pares y "+impar+" impares\n");
		
		
		JOptionPane.showMessageDialog(null,scrollPane,"Numeros Aleatorios", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
		
		
	}

}
