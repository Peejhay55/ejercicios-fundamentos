import java.util.Scanner;

public class Cuartoejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer n del usuario, que debe ser par
        System.out.print("Ingrese el tamaño del arreglo (n debe ser par): ");
        int n = scanner.nextInt();

        // Verificar que n sea par
        if (n % 2 != 0) {
            do {
                System.out.println("Error: El número ingresado no es par.");
                System.out.println("Ingrese otro tamaño del arreglo (n debe ser par): ");
                n = scanner.nextInt();
            } while (n%2 != 0);
        }

        // Crear el arreglo1 de tamaño n
        int[] arreglo1 = new int[n];

        // Llenar el arreglo1 con una serie basada en el índice
        System.out.println("Llenando arreglo1 con la serie i * 2:");
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i * 2; // Serie: múltiplos de 2 (puedes cambiarla según tu preferencia)
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println();

        // Crear el arreglo2 de tamaño n/2 de tipo float
        float[] arreglo2 = new float[n / 2];

        // Calcular los promedios de los pares consecutivos del arreglo1
        for (int j = 0; j < n / 2; j++) {
            arreglo2[j] = (arreglo1[2 * j] + arreglo1[2 * j + 1]) / 2.0f; // Promedio de dos consecutivos
        }

        // Mostrar el contenido del arreglo2
        System.out.println("Arreglo2 (promedios de los consecutivos de arreglo1):");
        for (int j = 0; j < n / 2; j++) {
            System.out.print(arreglo2[j] + " ");
        }
        System.out.println();

    }
}

