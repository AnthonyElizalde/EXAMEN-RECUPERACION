package BuscaminasRecuperacion;

import java.util.Scanner;

public class Jugar {

    private Tablero tablero;
    @SuppressWarnings("unused")
	private ClassVista vista;
    private Scanner scanner;

    public Jugar() {
        this.setTablero(new Tablero()); // Inicializa el tablero
        this.vista = new ClassVista();     // Inicializa la vista
        this.scanner = new Scanner(System.in);
    }

    public void iniciarJuego() {
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            ClassVista.mostrarTablero(Tablero.getCasillas()); // Muestra el tablero al jugador
            System.out.println("Introduce coordenadas (por ejemplo, A5):");

            try {
                String input = scanner.nextLine().toUpperCase().trim(); // Lee la entrada del jugador
                procesarCoordenadas(input); // Valida y procesa las coordenadas

                if (verificarVictoria()) {
                    ClassVista.mostrarMensaje("¡Felicidades! Has ganado.");
                    juegoTerminado = true;
                }
            } catch (CoordenadasInvalidasException | CasillaYaDescubiertaException e) {
                ClassVista.mostrarMensaje(e.getMessage()); // Muestra el mensaje de error personalizado
            } catch (Exception e) {
                ClassVista.mostrarMensaje("Error inesperado: " + e.getMessage());
            }
        }
    }

    private void procesarCoordenadas(String input) throws CoordenadasInvalidasException, CasillaYaDescubiertaException {
        // Validar y procesar las coordenadas ingresadas
        if (input.length() < 2 || input.length() > 3) {
            throw new CoordenadasInvalidasException("Entrada inválida. Usa formato letra-número (ejemplo: A5).");
        }

        char filaChar = input.charAt(0);
        int fila = filaChar - 'A';
        if (fila < 0 || fila >= 10) {
            throw new CoordenadasInvalidasException("Fila fuera de rango. Usa letras entre A y J.");
        }

        int columna = Integer.parseInt(input.substring(1)) - 1;
        if (columna < 0 || columna >= 10) {
            throw new CoordenadasInvalidasException("Columna fuera de rango. Usa números entre 1 y 10.");
        }

        ClassCasilla casilla = Tablero.getCasillas()[fila][columna];
        if (casilla.isDescubierta()) {
            throw new CasillaYaDescubiertaException("¡Esa casilla ya está descubierta!");
        }

        // Descubre la casilla si es válida
        casilla.setDescubierta(true);
    }

    private boolean verificarVictoria() {
        // Verifica si todas las casillas seguras han sido descubiertas
        for (ClassCasilla[] fila : Tablero.getCasillas()) {
            for (ClassCasilla casilla : fila) {
                if (!casilla.isMina() && !casilla.isDescubierta()) {
                    return false;
                }
            }
        }
        return true;
    }

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
}


