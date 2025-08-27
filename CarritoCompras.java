package EjercicioPOODuoc;

import CarritoDeCompras.Producto;

public class CarritoCompras {
    private String Productos;
    private double total;

    public CarritoCompras(){
        this.Productos="";
        this.total=0.0;
    }
    public void AgregarProductos(Producto producto){
        if (!Productos.isEmpty()){
            Productos+= ", ";
        }
        Productos+= producto.getNombre();
        total+=producto.getPrecio();
    }

    public String getProductos(){
        return Productos;
    }
    public double getTotal(){
        return total;
    }
}

