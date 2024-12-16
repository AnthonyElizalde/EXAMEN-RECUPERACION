package BuscaminasRecuperacion;

import org.junit.Test;

public class TableroTest {
    @Test
    public void testInicializacionTablero() {
        assertNotNull(Tablero.getCasillas(), "El tablero debe inicializarse correctamente.");
        assertEquals(10, Tablero.getCasillas().length, "El tablero debe tener 10 filas.");
        assertEquals(10, Tablero.getCasillas()[0].length, "El tablero debe tener 10 columnas.");
    }

    private void assertNotNull(ClassCasilla[][] casillas, String string) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(int i, int length, String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testColocacionMinas() {
        int contadorMinas = 0;
        for (ClassCasilla[] fila : Tablero.getCasillas()) {
            for (ClassCasilla casilla : fila) {
                if (casilla.isMina()) {
                    contadorMinas++;
                }
            }
        }
        assertEquals(10, contadorMinas, "Debe haber exactamente 10 minas en el tablero.");
    }

	public static ClassCasilla[][] getCasillas() {
		// TODO Auto-generated method stub
		return null;
	}
}

