/*
cara cruz
2 botones
*/
import javax.swing.*;
import java.awt.event.*;//eventos botonos
import java.awt.*;
import java.lang.*;

public class caraocruz{


	//hereda de JFrame
	public class Gui extends JFrame{
	
		private JButton boton1;
		private JButton boton2;	
	
	
	
	
		public Gui(){
		
			super("Cara o Cruz");
			//setLayout(new FloatLayout());
			Icon a = new ImageIcon(getClass().getResource("cara.jpg"));//crear icono y obtener recurso de la carpeta
			Icon b = new ImageIcon(getClass().getResource("cruz.jpg"));
		
		
		
			JPanel panel=new JPanel();
				panel.setVisible(true);
				panel.setSize(200,200);
				add(panel);
		
		
		
			boton1=new JButton("cara");
				add(boton1);
		
		
		
			boton2=new JButton("cruz");
				add(boton2);
		
			getContentPane().add(boton1);
			getContentPane().add(boton2);
		

			}

	}
	
	


	public static void main(String args[]){
			
		int random=0;
		
		random=(int)(Math.random()*2)+1;
		
		JFrame frame = new JFrame("Cara o cruz");//nueva ventana y su titulo 
			frame.setVisible(true);//visible
			frame.setSize(400,400);//ajustamos el tamño
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("cara o cruz");//label de texto
		JPanel panel= new JPanel();
			frame.add(panel);
			panel.add(label);
	
		JButton button = new JButton("Cara");
			panel.add(button);
		
		JButton button1 = new JButton("Cruz");
			panel.add(button1);
		
		//1 para cara 2 para cruz
		if(random==1){
			button.addActionListener(new ActionSuccess());
			//label.setText("ha salido cara");
		}
		else if(random==2){
			button.addActionListener(new ActionFail());
			//label.setText("ha salido cruz");
		}
		
		 if(random==1){
			button1.addActionListener(new ActionFail());
			//label.setText("ha salido cara");
		}
		else if(random==2){
			button1.addActionListener(new ActionSuccess());
			//label.setText("ha salido cruz");
		}
		
		
		}//fin del main
		
		static class ActionSuccess implements ActionListener{
			
			
			public void actionPerformed (ActionEvent e){
				
				JFrame frame2=new JFrame("resultado");
					frame2.setVisible(true);
					frame2.setSize(200,200);
				JLabel label = new JLabel("has acertado");
				
				JPanel panel = new JPanel();
					frame2.add(panel);
					panel.add(label);
				
				
			}
		}
		
		static class ActionFail implements ActionListener{
			
			
			public void actionPerformed (ActionEvent e){
				
				JFrame frame2=new JFrame("resultado");
					frame2.setVisible(true);
					frame2.setSize(200,200);
				JLabel label = new JLabel("has fallado");
				
				JPanel panel = new JPanel();
					frame2.add(panel);
					panel.add(label);
				
				
			}
		}
		

		

		

	}//fin programa

