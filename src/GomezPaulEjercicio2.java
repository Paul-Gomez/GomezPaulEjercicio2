//Importo la clase scanner para leer la entrada del usuario
import java.util.Scanner;

public class GomezPaulEjercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicito el carácter y lo guardo como "pattern"
        System.out.print("Ingresa el carácter para el patrón del tablero: ");
        char pattern = scanner.next().charAt(0);

        // Solicito el tamaño ("size") entre 1 y 15. Si no es así lo comunico para que pruebe otra vez.
        int size;
        do {
            System.out.print("Ingresa el tamaño de la casilla (1 a 15): ");
            size = scanner.nextInt();
            if (size < 1 || size > 15) {
                System.out.println("El tamaño debe estar entre 1 y 15. Inténtalo de nuevo.");
            }
        } while (size < 1 || size > 15);