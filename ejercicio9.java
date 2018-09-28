/*
Un almacen de pedidos vende cinco productos cuyos precios son los siguientes:
Producto 1 --> 2.30 euros
Producto 2 --> 4.12 euros
Producto 3 --> 6.11 euros
Producto 4 --> 5.12 euros
Producto 5 --> 4.77 euros
Escribir una aplicación que pida el número de producto y la cantidad vendida de ese producto, hasta
que se introduzca el valor -1.
A partir de hay debe de mostrar la lista de productos vendidos, su cantidad, y el valor del producto *
cantidad del producto y al final la suma de todos los productos.
Ej:
Producto
Cantidad
Total producto
Producto 1
 2
4.60
Producto 2
 1
4.12
TOTAL
       8.72
*/

import javax.swing.*;

public class ejercicio9{
	
	
	public static void main(String args[]){
		
		int cantidad=0, IDproducto=0;
		float  total=0;
		JTextArea areaSalida=new JTextArea();
	
		
			areaSalida.append("ID producto\t"+"cantidad\t"+"precio/unidad\t"+"precio*unidades\t\n");
		do{
		IDproducto = Integer.parseInt(JOptionPane.showInputDialog(null,"bienvenido a nuestra tienda, estos son nuestros productos\n" 
																	+"Producto 1 --> 2.30 euros\n"+
																	" Producto 2 --> 4.12 euros\n"+
																	" Producto 3 --> 6.11 euros\n"+
																	" Producto 4 --> 5.12 euros\n"+
																	" Producto 5 --> 4.77 euros\n"+
																	"que es lo que desea?"+
																	"introduzca -1 para finalizar compra"));
																	
		
		
		if(IDproducto>=1 && IDproducto<=5)															
		cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"cuanta cantidad quiere?"));
		
			switch(IDproducto){
				
				case 1:
					total+=(2.30*cantidad);
					areaSalida.append("producto"+IDproducto+"\t"+cantidad+"\t2,30 euros\t"+(2.30*(float)cantidad)+"-\n");
					break;
					
				case 2:
					total+=(4.12*cantidad);
					areaSalida.append("producto"+IDproducto+"\t"+cantidad+"\t4,12 euros\t"+(4.12*(float)cantidad)+"-\n");
					break;

				case 3:
					total+=(6.11*cantidad);
					areaSalida.append("producto"+IDproducto+"\t"+cantidad+"\t6,11 euros\t"+(6.11*(float)cantidad)+"-\n");
					break;

				case 4:
					total+=(5.12*cantidad);
					areaSalida.append("producto"+IDproducto+"\t"+cantidad+"\t5,12 euros\t"+(5.12*(float)cantidad)+"-\n");
					break;
					
				case 5:
					total+=(4.77*cantidad);
					areaSalida.append("producto"+IDproducto+"\t"+cantidad+"\t4,77 euros\t"+(4.77*(float)cantidad)+"-\n");
					break;
					
				default:
					IDproducto=-1;
					areaSalida.append("\t\t\tcompra  finalizada\tTOTAL: \t\t"+total+" euros");
					break;

			
			}
			
			JOptionPane.showMessageDialog(null,areaSalida);

		}while(IDproducto!=-1);	
		
		
		
		
		
		
		
		
		
	}
	

	
}
