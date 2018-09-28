/*
nombre exam 1 exam 2 exam 3  media 
*/
import javax.swing.*;


public class examenes{
	
	
	
	public static void main(String args[]){
		
		String nombre="";
		float nota=0, nota2=0, nota3=0;
		int i=0, numeroAlumnos=0;
		JTextArea areaSalida = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(areaSalida);
		
		areaSalida.append("nombre\tnota1\tnota2\tnota3\tmedia\n\n");
		
		numeroAlumnos=Integer.parseInt(JOptionPane.showInputDialog(null,"introducenumero de alumnos"));
		
		for(i=1;i<=numeroAlumnos;i++){
			
			nombre=JOptionPane.showInputDialog(null,"introduce nombre del alumno");
			
			do{
			nota=Float.parseFloat(JOptionPane.showInputDialog(null,"introduce la primera nota"));
			}while(nota<=0 && nota>=10);
			
			do{
			nota2=Float.parseFloat(JOptionPane.showInputDialog(null,"introduce la segunda nota"));
			}while(nota2<=0 && nota2>=10);
			
			do{
			nota3=Float.parseFloat(JOptionPane.showInputDialog(null,"introduce la tercera nota"));
			}while(nota3<=0 && nota3>=10);
			
			areaSalida.append(nombre+"\t"+nota+"\t"+nota2+"\t"+nota3+"\t"+((nota+nota2+nota3)/3)+"\n");
			
			
			
			
			
			
			
		}//fin del for

		
		JOptionPane.showMessageDialog(null, scrollPane,"evaluacion", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);




		
	}
	

	
}
