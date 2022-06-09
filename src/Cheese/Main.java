/*
*	grupo  :GDAM TARDE 2021-2022
*	alumno :Francisco Javier Calderón Aragón
*	n.exp. :7746
*	fecha  :09/06/22
 */
package Cheese;

/**
 * Clase main del examen
 * @author Francisco Javier Calderón Aragón
 */
public class Main {
	/**
	 * MÃ©todo main del examen
	 * @param args Argumentos para linea de comandos
	 * @author Francisco Javier Calderón Aragón
	 */
     public static void main(String[] args) {
    	 Producto p1,p2,p3;
    	 ListaProductos Lista = new ListaProductos("curro");
    	 Producto producto1 = new Producto("0001","lácteo",2,100);
    	 Producto producto2 = new Producto("0002","verdura",1,200);
    	 
    	 Lista.registraProducto(producto1);
    	 Lista.registraProducto(producto2);
    	 producto1.imprime_etiqueta();
    	 producto2.imprime_etiqueta();
    	 
    	
    	 
    
         System.out.println("1Âº Gdam: Entornos de desarrollo");

     }
}
