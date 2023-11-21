import java.util.LinkedList;
public class Cliente {
    private String nombre;
    private String direcciónDeEnvío;
    /*
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public Cliente(String nombre, String direcciónDeEnvío){
        this.nombre=nombre;
        this.direcciónDeEnvío=direcciónDeEnvío;

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
    public String getDirecciónDeEnvío() {
        return direcciónDeEnvío;
    }
}
