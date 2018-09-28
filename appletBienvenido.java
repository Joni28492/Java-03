/*
 * probando los applets
 * extends-> hereda de....
 * */
 
 import java.awt.Graphics;//graficos
 import javax.swing.JApplet;//applets pequeños programos incustrados en pagina web
				
public class appletBienvenido extends JApplet{
	
	//init, start y paint los metodos que se vana  llamar 
	//start y init estan en la clase padre 
	public void paint(Graphics g){//se tiene que llamar paint si o si 
		
		super.paint(g);//super llamando al metodo del padre
		
		g.drawString("bienvenidos al curso", 25,25);//cadena de texto en esas coordenadas	
		g.drawString("Adios mundo", 25,40);
		
		g.drawLine(15,10,210,10);//dibuja una linea mediante cordenadas x y x1 y1
		g.drawLine(15,45,210,45);
			
	}
	
	
	
	
	
	
	
	
	
	
}
