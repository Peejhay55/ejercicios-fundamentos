import java.util.Scanner;
import java.util.Random;

public class Octavo {
    public static void main(String[] args) {
        // Crear objetos Scanner y Random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir al usuario el número de filas y columnas
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[m][n];

        // Llenar la matriz con números aleatorios entre 0 y 10
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(11); // Generar número entre 0 y 10
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

