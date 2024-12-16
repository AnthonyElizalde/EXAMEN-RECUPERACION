package BuscaminasRecuperacion;


public class ProcesarCoordenadasInput {

    // Método que contiene el bloque try-catch
    public void ejecutar(String input) {
        try {
            procesarCoordenadas(input); // Valida y procesa las coordenadas
            // Aquí se puede actualizar el tablero según las coordenadas válidas
            System.out.println("Coordenadas procesadas correctamente.");
        } catch (CoordenadasInvalidasException | CasillaYaDescubiertaException e) {
            // Muestra un mensaje en caso de error
            System.out.println(e.getMessage());
        }
    }

    // Método que valida y procesa las coordenadas
    private void procesarCoordenadas(String input) throws CoordenadasInvalidasException, CasillaYaDescubiertaException {
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

        // Aquí se podría acceder al tablero y validar si la casilla ya está descubierta
        System.out.println("Fila: " + fila + ", Columna: " + columna);
    }
}


