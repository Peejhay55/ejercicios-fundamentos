
import java.util.Scanner;

public class Segundoejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Crear el arreglo1 y llenarlo con una serie basada en el índice i (en este caso, multiplicamos el índice por 2)
        int[] arreglo1 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i * 2; // Puedes cambiar la lógica de la serie como prefieras
        }

        // Mostrar el contenido de arreglo1
        System.out.println("Contenido de arreglo1:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println();

        // Crear arreglo2 invirtiendo los elementos de arreglo1
        int[] arreglo2 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo2[i] = arreglo1[(n - 1) - i];
        }

        // Mostrar el contenido de arreglo2
        System.out.println("Contenido de arreglo2 (invertido):");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo2[i] + " ");
        }
        System.out.println();
    }
}
