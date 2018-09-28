/*
 * 
Escriba una aplicación que imprima la siguiente figura de rombo. Puede utilizar instrucciones de 
salida que imprima un solo *, un solo espacio o un solo carácter de nueva linea. Maximice el uso de
la repetición (con instrucciones for anidadas), y minimice el número de instrucciones de salida.
    *    
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    
 * 
 * */
 
 
 public class ejercicio7{
	 
	 
	 
		public static void main(String args[]){
			
			int i=0, j=0,k=0,l=1,m=0,  max=18;
		
			
			for(i=0;i<=max;i+=2){
				
				
					//triangulo superior
					if(i<max/2){
						
						for(j=1; j<=((max/2)-i)/2;j++){
							
						System.out.print(" ");
							
						}
						
						for(k=0; k<=i;k++)
						System.out.print("*");
						
					System.out.println();
						
						
					}
					
					
					
					//triangulo inferior
					else{
						
						
		
						
						//aqui me quede
						while(m<l){
							System.out.print(" ");
							m++;
						}
						
						
						for(j=max; j > i+1  ;j--){
							
							System.out.print("*");
							
						}
						
						l++;
						m=0;

						
						System.out.println();
					}
					

			}
			
			
			
			
			
			
			
			
			
			
			
		}
	 

	 
}
