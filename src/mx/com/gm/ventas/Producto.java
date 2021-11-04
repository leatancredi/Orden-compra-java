
package mx.com.gm.ventas;


public class Producto {
  private final int idProducto;
  private String nombre;
  private double precio;
  private static int contadorProductos;
  
  private Producto(){//constructor vacio
      this.idProducto = ++Producto.contadorProductos;//incrementa por cada objeto que se cree
  }
  
  public Producto(String nombre, double precio){
      this();//llamada al contructor vacio e inicia la variable de idproducto
      this.nombre = nombre;
      this.precio = precio;
      
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
}
