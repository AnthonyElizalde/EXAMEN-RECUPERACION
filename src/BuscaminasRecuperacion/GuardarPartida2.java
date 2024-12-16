package BuscaminasRecuperacion;

import java.io.IOException;

public class GuardarPartida2 {

    @SuppressWarnings("unused")
	private static void guardarPartida(Tablero tablero) {
        try {
            Persistencia.guardarJuego(tablero, "partida_guardada.dat");
            System.out.println("Partida guardada exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar la partida: " + e.getMessage());
        }
    }
}
