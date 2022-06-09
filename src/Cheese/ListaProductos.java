/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el nÃºmero de productos contenidos en la lista
     */
    private static int n = 0;
    
   
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no estÃ¡ vacÃ­a)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vacÃ­a, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return true; else return false;
    }
    
    /**
     * Poner noNamed a los productos que no tengan nombre
     * @param nombre String a analizar
     */

    public ListaProductos(String nombre) {
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    /**
     * Obtener el número de productos
     * @return el número total de productos
     * 
     */
    public int totalProductos(){
            return this.getNumProductos();
    }
        
    /**
     * Registrar un objeto
     * @param prod objeto Producto
     * @return si la key está bien registra el producto y si sale mal te devuelve un valor nulo
     */
    public Producto registraProducto(Producto prod) {
    	if(parametro_vacio(prod.getcode())) return null;
        
        if (listaP.containsKey(prod.getcode())) {
           return null;
        }
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }
    /**
     * descartar  productos
     * @param codigo String
     * @return si el producto no es nulo lo descarta sino te devuelve el producto
     */

    public Producto descartaProducto(String codigo) { 
    	
    	if (parametro_vacio(codigo)) return null;
        
        Producto prod = encuentraProducto(codigo);
        if (prod != null) {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return prod;
    }
    /**
     * encontrar un producto
     * @param codigo String
     * @return si la lista no contiene el código del producto devolver producto, sino devuelve el código del producto
     */
    public Producto encuentraProducto(String codigo) { 
    	if (parametro_vacio(codigo)) return null;
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}
