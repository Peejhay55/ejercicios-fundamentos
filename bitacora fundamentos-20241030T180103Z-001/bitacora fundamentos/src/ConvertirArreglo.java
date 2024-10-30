import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ConvertirArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Llamada a las funciones desde el main
        int[] arregloEstatico = crearArreglo(n);
        ArrayList<Integer> arregloDinamico = convertirArrEstatico(arregloEstatico);

        System.out.println("Contenido del ArrayList:");
        imprimirArrDin(arregloDinamico);

        scanner.close();
    }

    // Función para crear un arreglo estático de enteros con valores aleatorios entre 0 y 99
    public static int[] crearArreglo(int n) {
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);  // Genera un valor aleatorio entre 0 y 99
        }

        return arr;
    }

    // Función para convertir un arreglo estático en un ArrayList dinámico
    public static ArrayList<Integer> convertirArrEstatico(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int num : arr) {
            arrList.add(num);  // Agrega cada elemento del arreglo al ArrayList
        }

        return arrList;
    }

    // Función para imprimir los elementos del ArrayList
    public static void imprimirArrDin(ArrayList<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();  // Salto de línea al final
    }
}

