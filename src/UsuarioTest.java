import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
@Test
    public void agregarCancionUsuarioFree() {

    Usuario usuario = new Usuario("Free");
    ProveedorCancionProxy proveedorCancionProxy = new ProveedorCancionProxy();
    Cancion cancion = new Cancion("Carlos santana");

    String respuestaEsperada = "el usuario 0 es un usuario gratuito y no puedo efectuar esta accion";
    String respuesta = proveedorCancionProxy.getCancion(usuario,cancion);

    assertEquals(respuesta,respuestaEsperada);

    }


@Test
    public void agregarCancionUsuarioPremium() {

        Usuario usuario = new Usuario("Premium");
        ProveedorCancionProxy proveedorCancionProxy = new ProveedorCancionProxy();
        Cancion cancion = new Cancion("Carlos santana");

        String respuestaEsperada = "Se agrego la cancion " + cancion.getNombre();;
        String respuesta = proveedorCancionProxy.getCancion(usuario,cancion);

        assertEquals(respuesta,respuestaEsperada);

    }
}