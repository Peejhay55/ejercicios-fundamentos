import java.util.Random;
import java.util.Scanner;

public class Noveno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al usuario el tamaño de la matriz
        System.out.print("Introduce el tamaño n de la matriz (n x n): ");
        int n = scanner.nextInt();

        // Crear y llenar la matriz1 con valores aleatorios entre 0 y 99
        int[][] matriz1 = new int[n][n];
        System.out.println("Matriz1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(100);  // Valores aleatorios de 0 a 99
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }

        // Crear la matriz2 para la transposición de matriz1
        int[][] matriz2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = matriz1[j][i];  // Realizar la transposición
            }
        }

        // Imprimir la diagonal de la matriz2
        System.out.println("\nDiagonal de la matriz transpuesta (matriz2):");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz2[i][i] + " ");
        }
    }
}

