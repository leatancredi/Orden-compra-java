
package mx.com.gm.ventas;


public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;//para ponerle un tope al array

    public Orden() {// constructor vacio
        this.idOrden = ++Orden.contadorOrdenes;//pre incremento para que se agregue el valor en 1.
        this.productos = new Producto[Orden.MAX_PRODUCTOS];//inicia el arreglo de productos.
    }
    
    public void agregarProducto(Producto producto){//metodo para agregar producto
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos" + Orden.MAX_PRODUCTOS);//imprime el mensaje y la cantidad maxima de productos del array
        }
        
    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i];
            //total += producto.getPrecio(); //total = total + producto.getPrecio()
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    public void mostarOrden(){
        System.out.println("id Orden" + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("total de la orden: $" + totalOrden);
        System.out.println("productos de la orden");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]); // se imprime el iobjeto tipo producto
        }
    }
}
