import java.util.LinkedList;
public class Cliente {
    private String nombre;
    private String direcciónDeEnvío;

    public Cliente(String nombre, String direcciónDeEnvío){
        this.nombre=nombre;
        this.direcciónDeEnvío=direcciónDeEnvío;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDirecciónDeEnvío() {
        return direcciónDeEnvío;
    }
}
