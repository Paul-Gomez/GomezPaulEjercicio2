import java.util.Scanner;

public class ChessBoard {

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