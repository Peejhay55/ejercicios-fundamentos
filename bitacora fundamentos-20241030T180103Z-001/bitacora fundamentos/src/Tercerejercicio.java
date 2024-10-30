import java.util.Scanner;

public class Tercerejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Crear el arreglo arr_int de tamaño n
        int[] arr_int = new int[n];

        // Llenar el arreglo con los valores proporcionados por el usuario
        System.out.println("Ingrese " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arr_int[i] = scanner.nextInt();
        }

        // Crear el segundo arreglo para almacenar el arreglo invertido
        int[] arr_invertido = new int[n];
        for (int i = 0; i < n; i++) {
            arr_invertido[i] = arr_int[n - 1 - i];
        }

        // Imprimir los dos arreglos
        System.out.println("\nArreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr_int[i] + " ");
        }

        System.out.println("\n\nArreglo invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr_invertido[i] + " ");
        }

        scanner.close();
    }
}

