
/*
 * cancion 
 * The Twelve Days of Christmas
 * 
 * mediante bucles y switch
 * 
 * */
 
 import javax.swing.*;

public class cancion{
	
	
	public static void main(String args[]){

	JTextArea areaSalida= new JTextArea(50,50);
	JScrollPane scrollPane=new JScrollPane(areaSalida);
	
	for(int i=1;i <=12;i++){
		
		areaSalida.append("\n\n");
		
		switch(i){
			
			case 1:
				areaSalida.append("On the First ");
				break;

			case 2:
				areaSalida.append("On the Second ");
				break;
				
			case 3:
				areaSalida.append("On the Third ");
				break;
				
			case 4:
				areaSalida.append("On the Fourth ");
				break;
				
			case 5:
				areaSalida.append("On the Fifth ");
				break;
				
			case 6:
				areaSalida.append("On the sixth ");
				break;
				
			case 7:
				areaSalida.append("On the seventh ");
				break;
				
			case 8:
				areaSalida.append("On the eighth ");
				break;
				
			case 9:
				areaSalida.append("On the ninth ");
				break;
				
			case 10:
				areaSalida.append("On the tenth ");
				break;
				
			case 11:
				areaSalida.append("On the eleventh ");
				break;
				
			case 12:
				areaSalida.append("On the twelfth ");
				break;
			
			default:
			break;
			
		} //fin del primer switch
		
		areaSalida.append("day of Christmas my true love sent to me\n");
		/**/
		
		
		switch(i){
			
			case 12:
				areaSalida.append("Twelve drummers drummin,\n");
				
				
			case 11:
				areaSalida.append("Eleven pipers pipin,\n");
				
				
			case 10:
				areaSalida.append("Ten ladies dancin,\n");
				
			
			case 9:
				areaSalida.append("Nine lords a-leapine,\n");
				
				
			case 8:
				areaSalida.append("Eight maids a-milkin,\n");
				
				
			case 7:
				areaSalida.append("Seven swans a-swimmin,\n");
				
				
			case 6:
				areaSalida.append("Six geese a-layin,\n");
				
				
				
			case 5:
				areaSalida.append("Five golden rings,\n");
				
				
			case 4:
				areaSalida.append("Four calling birds,\n");
				
			
			case 3:
				areaSalida.append("Three French Hens,\n");
				
			
			case 2:
				areaSalida.append("Two Turtle Doves,\n");
				
				
			case 1:
				areaSalida.append("a Partridge in a Pear Tree,\n");
				
				

			
			default:
				areaSalida.append("\n");
				break;
			
		}//fin segundo switch
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//fin del bucl for
	
	//JOptionPane.showMessageDialog(null, areaSalida);
			JOptionPane.showMessageDialog(null,scrollPane,"The Twelve Days of Christmas", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
}
}
