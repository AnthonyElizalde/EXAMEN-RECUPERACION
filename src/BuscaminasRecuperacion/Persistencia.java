package BuscaminasRecuperacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persistencia {
    public static void guardarJuego(Tablero tablero, String archivo) throws IOException {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(tablero);
        }
    }

    public static Tablero cargarJuego(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Tablero) entrada.readObject();
        }
    }
}