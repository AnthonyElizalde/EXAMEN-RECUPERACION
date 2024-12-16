package BuscaminasRecuperacion;

import org.junit.Test;

public class ControladorTest {
    @SuppressWarnings("static-access")
	@Test
    public void testVerificarVictoria() {
        Tablero tablero = new Tablero();
        Controlador controlador = new Controlador();

        // Simula un tablero sin minas descubiertas
        for (ClassCasilla[] fila : tablero.getCasillas()) {
            for (ClassCasilla casilla : fila) {
                if (!casilla.isMina()) {
                    casilla.setDescubierta(true);
                }
            }
        }
        assertTrue(controlador.verificarVictoria(), "El jugador debe ganar si descubre todas las casillas seguras.");
    }

	private void assertTrue(boolean verificarVictoria, String string) {
		// TODO Auto-generated method stub
		
	}
}

