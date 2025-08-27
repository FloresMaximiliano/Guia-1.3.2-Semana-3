package EjercicioPOODuoc;

import CarritoDeCompras.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("2004","PlayStation 5",50000.0);
        Producto p2= new Producto("30405650", "Switch", 70000.0);

        CarritoCompras carrito = new CarritoCompras();
        carrito.AgregarProductos(p1);
        carrito.AgregarProductos(p2);
        
        System.out.println("Productos en carrito: " + carrito.getProductos());
        System.out.println("Total: $" + carrito.getTotal());
    }
}
