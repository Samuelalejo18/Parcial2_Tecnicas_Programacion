public class Pedido  {
private Producto producto;
private int cliente;
 private int numeroDeProductos;
    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
public Pedido(Producto producto, Producto numeroDeProductos, int cliente ){

    this.producto=producto;
    this.cliente=cliente;
    this.numeroDeProductos= numeroDeProductos.getCantidadInventario();

}
    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public int getCliente() {
        return cliente;
    }
    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public Producto getProducto() {
        return producto;
    }



}
