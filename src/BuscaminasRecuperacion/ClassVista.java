package BuscaminasRecuperacion;

public class ClassVista {

public static void mostrarTablero(ClassCasilla[][] casillas) {
    System.out.println("   1  2  3  4  5  6  7  8  9 10");
    char fila = 'A';
    for (int i = 0; i < casillas.length; i++) {
        System.out.print(fila++ + " ");
        for (int j = 0; j < casillas[i].length; j++) {
            ClassCasilla casilla = casillas[i][j];
            if (casilla.isDescubierta()) {
                if (casilla.isMina()) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" " + casilla.getMinasAdyacentes() + " ");
                }
            } else if (casilla.isMarcada()) {
                System.out.print(" M ");
            } else {
                System.out.print(" ? ");
            }
        }
        System.out.println();
    }
}

public static void mostrarMensaje(String mensaje) {
    System.out.println(mensaje);
}
}
