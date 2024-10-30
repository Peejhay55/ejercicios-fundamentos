import java.util.Scanner;

public class Quintoejercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        // Crear el arreglo1 y llenarlo usando el índice i
        int[] arreglo1 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i + 1;  // Llenar el arreglo con una serie basada en el índice
        }

        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println();

        // Invertir el arreglo1 sin usar un segundo arreglo, solo variables temporales
        for (int i = 0; i < n/2 ; i++) {
            int temp = arreglo1[i];
            arreglo1[i] = arreglo1[n - 1 - i];
            arreglo1[n - 1 - i] = temp;
        }

        // Imprimir el arreglo invertido
        System.out.println("Arreglo invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo1[i] + " ");
        }
    }
}

