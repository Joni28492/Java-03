/*notas alumnos switch*/


import java.util.Scanner;

public class notasAlumnos{
	
	
	
		public static void main(String args[]){
		
			Scanner sc=new Scanner(System.in);
			int aprobados=0, suspensos=0, alumnos=0, i=0,calificacion=0;
			
			System.out.println("introduce numero de alumnos");
			alumnos=sc.nextInt();
			
			
			for(i=1; i<=alumnos; i++){
				
				System.out.println();
				System.out.printf("introduce calificacion del alumno %d\n", i);
				System.out.println("1-Sobresaliente");
				System.out.println("2-notable");
				System.out.println("3-suficiente");
				System.out.println("4-suspenso");
				
				calificacion=sc.nextInt();
				
					switch(calificacion){
						
						case 1:
						 
							System.out.printf("el alumno %d tiene sobresaliente", i);
							System.out.println();
							aprobados++;
							break;
							
						case 2:
							System.out.printf("el alumno %d tiene notable", i);
							System.out.println();
							aprobados++;
							break;
						
					
						case 3:
							System.out.printf("el alumno %d tiene suficiente", i);
							System.out.println();
							aprobados++;
							break;
						case 4:
						
							System.out.printf("el alumno %d esta suspenso", i);
							System.out.println();
							suspensos++;
							break;
							
						default:
						
							System.out.println("notas introducidas");
							System.out.println();
							
							
							break;
						
						
						
						
					}
					
				
			}
			
			System.out.printf("\n%d aprobados %d suspensos\n", aprobados, suspensos);
			

		
		
		}
	
	

	
	
}
