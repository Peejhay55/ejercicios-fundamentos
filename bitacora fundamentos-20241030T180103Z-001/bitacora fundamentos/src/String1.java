import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Leer las dos cadenas (str1 y str2)
        System.out.print("Ingresa la primera cadena (str1): ");
        String str1 = scanner.nextLine();

        System.out.print("Ingresa la segunda cadena (str2): ");
        String str2 = scanner.nextLine();

        // Comparar las cadenas
        if (str1.equals(str2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}

