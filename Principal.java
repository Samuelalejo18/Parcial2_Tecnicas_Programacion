import java.util.LinkedList;

import java.util.Scanner;
/**
 * clase Principal
 */

public class Principal {
    /**
     * Método inicial que es ejecutado
     *
     * @param args Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Producto tienda = new Producto(  "Telefono","new samsung",1000,100);
Cliente cliente= new Cliente("Samuel","mi casa");

Pedido pedido=tienda.agregarPedido()
// Crear objetos de la clase Libro
       /*
        int opcion = -1; // Operación de tiempo constante, O(1)

        while (opcion != 0) {
            // Impresión de mensaje de tiempo constante, O(1)
            System.out.println("Bienvenidos a la tineda");
            System.out.println("Ingresa la opción:"); //
            System.out.println("1. Buscar producto"); //
            System.out.println("2. Mostrar productos disponibles");
            System.out.println("3.hacer nuevo pedido");
            System.out.println("0. Salir");

            opcion = lector.nextInt();
            lector.nextLine();
/*
            /* Switch case tiempo constante 0(1)*/
         /*   switch (opcion) {
                case 1 -> {
*/
                    /*
                    } else {

                    }
                }
                /*
                case 2 -> {

                    }
                }/*
                case 3 -> {

/*
                    // Registrar el nuevo libro en la biblioteca

                }
                case 0 ->

                default ->
                   /*
            }
        }

    }
}
*/