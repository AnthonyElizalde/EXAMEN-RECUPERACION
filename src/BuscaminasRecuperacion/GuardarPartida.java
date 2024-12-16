package BuscaminasRecuperacion;

import java.io.IOException;
import java.rmi.AccessException;

public class GuardarPartida {

    private Tablero tablero;

    public GuardarPartida(Tablero tablero) {
        this.tablero = tablero;
    }

    public void guardarPartida() throws IOException {
        try {
            Persistencia.guardarJuego(tablero, "partida_guardada.dat");
            System.out.println("Partida guardada exitosamente.");
        } catch (AccessException e) {
            System.out.println("Error al guardar la partida: " + e.getMessage());
        }
    }

    public static Tablero cargarPartida() throws IOException {
        try {
            return Persistencia.cargarJuego("partida_guardada.dat");
        } catch (AccessException | ClassNotFoundException e) {
            System.out.println("Error al cargar la partida: " + e.getMessage());
            return null;
        }
    }
}