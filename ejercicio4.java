

public class ejercicio4{
	
	
	
	
		public static void main(String args[]){
			
			int i=0, j=0, k=0, max=10;
			//primer triangulo
			for(i=1;i<=max;i++){
				
				for(j=1;j<=i;j++){
				System.out.print ("*");
					
				}
				
				
			System.out.println();
				
				
			}
			
			
			System.out.println();
			System.out.println();
			
			//segundo triangulo
			for(i=10;i>=1;i--){
				
				for(j=1;j<=i;j++){
				System.out.print ("*");
					
				}
				
				
			System.out.println();
				
				
			}
			
			
			System.out.println();
			System.out.println();
			

			//tercer triangulo

			
			for(i=10;i>=1;i--){
				
			
				for(k=0;k<=max-i;k++){
					System.out.print (" ");
				}
			
			
				for(j=1;j<i;j++){	
	
					System.out.print ("*");							
				}
			
			
			System.out.println();
			
			
			}
			
	
		//cuarto triangulo
		
			System.out.println();
			System.out.println();
			
			
					
			for(i=1;i<=max;i++){
				
			
				for(k=0; k<max-i;k++){
					
					System.out.print (" ");	
				}
				

			
			
			
			
				for(j=1;j<=i;j++){	
	
					System.out.print ("*");							
				}
				
	
			
			
			System.out.println();
			
			
			}
			
			
			
		}
	
		
}
