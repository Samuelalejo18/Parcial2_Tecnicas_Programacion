import java.util.LinkedList;
public class Pedido  {
private Producto producto;
private Cliente cliente;
 private int numeroDeProductos;
public Pedido( Producto producto, Cliente cliente){

    this.producto=producto;
    this.cliente=cliente;

}

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }



}
