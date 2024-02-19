public class ProveedorCancionProxy implements  IProveedorCancion{
    private ProveedorCancion proveedorCancion;

    public ProveedorCancionProxy() {
        proveedorCancion = new ProveedorCancion();
    }

    @Override
    public String getCancion(Usuario usuario, Cancion cancion) {
        String respuesta = "Se agrego la cancion " + cancion.getNombre();
        if (usuario.getTipo() == "Premium") {
            usuario.agregarCancion(cancion);
        } else  {
            respuesta = "el usuario " + usuario.getId() +" es un usuario gratuito y no puedo efectuar esta accion";
        }
        return respuesta;
    }
}
