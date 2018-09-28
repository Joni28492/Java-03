/*
 * 
 * sumar los pares de 2 a 20
 * 
 *
 *  */


public class suma{
	
	
	
	
	public static void main(String args[]){
		
		int total = 0;
		
		for( int i=2; i <= 20; i += 2)
			total += i;
		
		//forma funcional y gocha
		//for (int contador=2; contador<=20; total+=contador, contador+=2);
		
		System.out.printf("\nla suma es %d ", total );
		
		
	}
	
	
}
