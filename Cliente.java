package EjercicioPOODuoc;
import CarritoDeCompras.Producto;
public class Cliente {
    private String idCliente;
    private String nombre;
    private CarritoCompras carrito;

    public Cliente(String idCliente,String nombre){
        this.idCliente=idCliente;
        this.nombre=nombre;
        carrito= new CarritoCompras();
    }
    
    public void agregarProducto(Producto producto){
        carrito.AgregarProductos(producto);
        System.out.println("Se agrego "+ producto);
    }
    public void mostrarCarrito(){
        System.out.println("Lo que llevas "+ nombre + ": " + carrito.getProductos());
        System.out.println("Total: "+ carrito.getTotal());
    }
    public CarritoCompras carrito(){
        return carrito;
    }
    public String getidCliente(){
        return idCliente;
    }
    public String getNombre(){
        return nombre;
    }
}
