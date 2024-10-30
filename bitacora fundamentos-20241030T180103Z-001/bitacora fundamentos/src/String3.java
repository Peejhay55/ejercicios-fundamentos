import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el string desde el teclado
        System.out.print("Introduce una cadena: ");
        String input = scanner.nextLine();

        // Invertir el string
        String reversed = new StringBuilder(input).reverse().toString();

        // Imprimir el string al revés
        System.out.println("La cadena reversada es:" + reversed);
    }
}
