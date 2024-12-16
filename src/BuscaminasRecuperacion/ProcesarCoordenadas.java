package BuscaminasRecuperacion;

public class ProcesarCoordenadas {

    private ProcesarCoordenadas(String input, Tablero tablero) throws CoordenadasInvalidasException, CasillaYaDescubiertaException {
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

        // Accede a la casilla desde el tablero
        ClassCasilla casilla = Tablero.getCasillas()[fila][columna];

        // Verifica si la casilla ya está descubierta
        if (casilla.isDescubierta()) {
            throw new CasillaYaDescubiertaException("¡Esa casilla ya está descubierta!");
        }

        // Si la casilla es válida, aquí puedes agregar más lógica, como marcarla como descubierta.
        casilla.setDescubierta(true);
    }
}
