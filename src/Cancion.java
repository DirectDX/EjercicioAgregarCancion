public class Cancion {
    private String nombre;
    private Integer id;
    private static Integer contadorId = 0;

    public Cancion(String nombre) {
        this.nombre = nombre;
        this.id = contadorId;
        contadorId++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
