import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Ingresa un string: ");
        String inputString = scanner.nextLine();

        // Solicitar al usuario que ingrese un carácter
        System.out.print("Ingresa un caracter: ");
        char inputChar = scanner.next().charAt(0);

        // Contador para el número de veces que aparece el carácter
        int contador = 0;

        // Recorrer el string y contar las ocurrencias del carácter
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                contador++;
            }
        }
        // Mostrar el resultado
        System.out.println("El caracter '" + inputChar + "' aparece " + contador + " veces en el string.");

    }
}

