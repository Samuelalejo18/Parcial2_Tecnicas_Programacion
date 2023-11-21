import java.util.LinkedList;

public class Producto {
    LinkedList<Producto> Productos = new LinkedList<>();
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadInventario;
/*
     * Complejidad temporal: O(n) Tiempo lineal
     */
            public Producto(String nombre, String descripcion, double precio, int cantidadInventario){
                this.nombre=nombre;
                this.descripcion=descripcion;
                this.precio=precio;
                this.cantidadInventario=cantidadInventario;
                this.Productos= new LinkedList<>();
            }
    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public String getNombre() {
        return nombre;
    }
    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public double getPrecio() {
        return precio;
    }

    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public int getCantidadInventario() {
        return cantidadInventario;
    }

    /**
     * Método que permite registrar un nuevo producto
     * @param Producto
     *
     * Complejidad temporal: O(1) Tiempo constante
     */


    /**
     * Método que permite buscar Producto
     * @param nombre
     *
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public Producto BuscarProducto(String nombre) {

        for (Producto Producto : Productos) {
            if (Producto.getNombre().equalsIgnoreCase(nombre)) {
                return Producto; // Se encontró el libro con el título especificado
            }
        }
        return null; // No se encontró el producto con el nombre especificado
    }

    /**
     * Método que permite registrar un nuevo libro
     * Complejidad temporal: O(1) Tiempo constante
     */
    public LinkedList<Producto> mostrarProductoDisponibles() {
        return Productos;
    }

    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public Pedido agregarPedido(Producto producto, int  numeroDeProductos){
        if (Productos.size() <cantidadInventario) {
           Pedido pedido  = new Pedido(this,producto, numeroDeProductos);
            Productos.add(producto);

            return pedido;
        } else {
            return null;
        }
    }


}
