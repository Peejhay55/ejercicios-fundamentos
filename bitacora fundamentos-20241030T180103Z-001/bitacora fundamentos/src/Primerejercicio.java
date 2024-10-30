import java.util.Scanner;

public class Primerejercicio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño del arreglo (variable x)
        System.out.print("Introduce el tamaño del arreglo: ");
        int x = scanner.nextInt();

        // Definir un nuevo arreglo de enteros llamado arr_int, de tamaño x
        int[] arr_int = new int[x];

        // Pedirle al usuario tantos números enteros como el tamaño del arreglo y asignar el doble
        for (int i = 0; i < x; i++) {
            System.out.print("Introduce un número entero: ");
            int num = scanner.nextInt();
            arr_int[i] = num * 2;
        }

        // Imprimir todos los valores del arreglo multiplicados por tres
        System.out.println("Valores del arreglo multiplicados por 3:");
        for (int i = 0; i < x; i++) {
            System.out.println(arr_int[i] * 3);
        }


    }
}
