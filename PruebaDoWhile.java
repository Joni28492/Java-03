public class PruebaDoWhile{
	
	
	
	public static void main(String args[]){
		
			int contador=0;
			
			
			do{
				
				System.out.printf("%d ", contador);
				contador++;
				
				
				}while(contador<=10);
			
			
			
			System.out.println();	
			contador=2000;
			
			do{
				
				
				System.out.printf(" %d ", contador);
				contador--;
				if(contador % 10==0) System.out.println();
				
				}while(contador>=1);	
				
		
		
		
		
	}
	
	
	
	
	
	
}
