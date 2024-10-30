import java.util.Scanner;

public class Septimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño de la matriz (n)
        System.out.print("Introduce el tamaño de la matriz (n): ");
        int n = scanner.nextInt();

        // Crear la matriz n x n
        int[][] matriz = new int[n][n];

        // Llenar la matriz con los números del 1 al n*n
        int num = 1;

        // Imprimir la matriz
        System.out.println("Matriz " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = num;
                num++;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
