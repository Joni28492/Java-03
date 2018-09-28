/*
 * 
 * 
 * tienen que parecer los 12 mese con su numero de dias
 * 
 * 
 * 
 * 
 * */

public class calendario{
	
	
	
	
	public static void main (String args[]){
	
		int i=0;
	
		for(i=1; i<=12; i++){
		
		
		
			switch(i){
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:	
			case  12:
				
				System.out.printf("\n el mes %d tiene 31 dias",i);
				break;
				
			case 2:
				System.out.printf("\n el mes %d tiene 28 dias",i);
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				
				System.out.printf("\n el mes %d tiene 30 dias",i);
				break;
				
			default:
			
				System.out.printf("estas en default");
			
				break;

			
			}
			
		}

	}
	
}
