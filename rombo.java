/*rombo con numero de filas introducidos*/

import java.util.Scanner;


public class rombo{
	
	public static void main(String args[]){


	int i=0, j=0,k=0,l=1,m=0,  max=18;
	Scanner sc=new Scanner(System.in);
	System.out.println("introduce el numero de filas");
	max=sc.nextInt();
	max*=2;

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
