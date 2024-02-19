import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static Integer contadorId =0;
    private String tipo;
    private  Integer id ;
    private List<Cancion> canciones;

    public Usuario(String tipo) {
        this.tipo = tipo;
        this.canciones = new ArrayList<>();
        this.id = contadorId;
        contadorId++;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }


    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void listarCanciones() {
        System.out.println("Lista de canciones para el usuario " + id + ":");
        for (Cancion cancion : canciones) {
            System.out.println(cancion.getNombre());
        }
    }
}
