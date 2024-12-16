package BuscaminasRecuperacion;

import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("¡Bienvenido al Buscaminas en Consola!");
        while (continuar) {
            try {
                mostrarMenu();
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        iniciarNuevoJuego();
                        break;
                    case 2:
                        System.out.println("Funcionalidad de carga aún no implementada.");
                        break;
                    case 3:
                        System.out.println("¡Gracias por jugar! Hasta pronto.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elige una opción entre 1 y 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, introduce un número.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n===== Menú Principal =====");
        System.out.println("1. Iniciar Nuevo Juego");
        System.out.println("2. Cargar Partida (Próximamente)");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void iniciarNuevoJuego() {
        System.out.println("\nIniciando un nuevo juego...");
        Controlador controlador = new Controlador();
        controlador.jugar();
    }
}
