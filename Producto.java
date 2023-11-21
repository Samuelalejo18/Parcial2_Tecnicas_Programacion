import java.util.LinkedList;

public class Producto {
    LinkedList<Producto> Productos = new LinkedList<>();
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadInventario;

            public Producto(String nombre, String descripcion, double precio, int cantidadInventario){
                this.nombre=nombre;
                this.descripcion=descripcion;
                this.precio=precio;
                this.cantidadInventario=cantidadInventario;
                this.Productos= new LinkedList<>();
            }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }


    public int getCantidadInventario() {
        return cantidadInventario;
    }





}
