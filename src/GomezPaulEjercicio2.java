import java.util.Scanner;

public class GomezPaulEjercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el carácter para el patrón
        System.out.print("Ingrese el carácter para el patrón del tablero: ");
        char pattern = scanner.next().charAt(0);

        // Solicitar al usuario el tamaño de la casilla asegurando que esté entre 1 y 15
        int size;
        do {
            System.out.print("Ingrese el tamaño de la casilla (1 a 15): ");
            size = scanner.nextInt();
            if (size < 1 || size > 15) {
                System.out.println("El tamaño debe estar entre 1 y 15. Inténtelo de nuevo.");
            }
        } while (size < 1 || size > 15);

        // Imprimir el tablero de ajedrez
        for (int i = 0; i < 8; i++) { // 8 filas
            for (int row = 0; row < size; row++) { // Altura casilla
                for (int j = 0; j < 8; j++) { // 8 columnas
                    for (int col = 0; col < size; col++) { // Ancho casilla
                        if ((i + j) % 2 == 0) {
                            System.out.print(pattern); // Casilla "blanca" con patrón
                        } else {
                            System.out.print(" "); // Casilla "negra" como espacio en blanco
                        }
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
