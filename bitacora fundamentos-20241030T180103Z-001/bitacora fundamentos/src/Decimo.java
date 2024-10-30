import java.util.Scanner;

public class Decimo {

    static Scanner scanner = new Scanner(System.in); //compartida por todas las instancias de la clase
    static int[][] estudiantes; // Matriz de 4 filas y n columnas
    //^compartida por todas las instancias de la clase

    public static void main(String[] args) {
        System.out.print("Ingrese el número de estudiantes (n): ");
        int n = scanner.nextInt();
        estudiantes = new int[4][n];

        menu();  // Llamada al menú principal
    }

    // Función 0: Menú
    public static void menu() {
        int opcion;
        do {
            System.out.println("\n--- Menú ---"); // el "\n" sirve para dar un salto o espaciado"
            System.out.println("1. Ingresar los datos de un estudiante");
            System.out.println("2. Buscar estudiante por ID");
            System.out.println("3. Contar estudiantes en un rango de edad");
            System.out.println("4. Imprimir todos los estudiantes");
            System.out.println("5. Imprimir estudiantes de un año específico");
            System.out.println("6. Calcular promedio de materias");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) { // el "switch" es un condicional o estructura de control, el cual evalua más de un caso
                case 1:
                    leerDatosEstudiante();
                    break;
                case 2:
                    buscarEstudiantePorId();
                    break;
                case 3:
                    contarEstudiantesPorRangoEdad();
                    break;
                case 4:
                    imprimirTodosEstudiantes();
                    break;
                case 5:
                    imprimirEstudiantesPorAnio();
                    break;
                case 6:
                    calcularPromedioMaterias();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    // Función 1: Leer los datos de un estudiante y almacenarlos
    public static void leerDatosEstudiante() {
        System.out.print("Ingrese el número de columna para almacenar los datos (0 a " + (estudiantes[0].length - 1) + "): ");
        int i = scanner.nextInt();

        if (i >= 0 && i < estudiantes[0].length) {
            System.out.print("Ingrese ID del estudiante: ");
            estudiantes[0][i] = scanner.nextInt();
            System.out.print("Ingrese edad del estudiante: ");
            estudiantes[1][i] = scanner.nextInt();
            System.out.print("Ingrese año de nacimiento del estudiante: ");
            estudiantes[2][i] = scanner.nextInt();
            System.out.print("Ingrese número de materias del estudiante: ");
            estudiantes[3][i] = scanner.nextInt();
        } else {
            System.out.println("Columna fuera de rango.");
        }
    }

    // Función 2: Buscar estudiante por ID
    public static void buscarEstudiantePorId() {
        System.out.print("Ingrese el ID del estudiante a buscar: ");
        int id = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < estudiantes[0].length; i++) {
            if (estudiantes[0][i] == id) {
                System.out.println("Estudiante encontrado: ");
                System.out.println("ID: " + estudiantes[0][i]);
                System.out.println("Edad: " + estudiantes[1][i]);
                System.out.println("Año de nacimiento: " + estudiantes[2][i]);
                System.out.println("Número de materias: " + estudiantes[3][i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Estudiante con ID " + id + " no encontrado.");
        }
    }

    // Función 3: Contar estudiantes en un rango de edad
    public static void contarEstudiantesPorRangoEdad() {
        System.out.print("Ingrese la edad mínima: ");
        int edad_min = scanner.nextInt();
        System.out.print("Ingrese la edad máxima: ");
        int edad_max = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < estudiantes[0].length; i++) {
            if (estudiantes[1][i] >= edad_min && estudiantes[1][i] <= edad_max) {
                contador++;
            }
        }

        System.out.println("Número de estudiantes entre " + edad_min + " y " + edad_max + ": " + contador);
    }

    // Función 4: Imprimir todos los estudiantes
    public static void imprimirTodosEstudiantes() {
        System.out.println("Listado de todos los estudiantes:");
        for (int i = 0; i < estudiantes[0].length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": ");
            System.out.println("ID: " + estudiantes[0][i]);
            System.out.println("Edad: " + estudiantes[1][i]);
            System.out.println("Año de nacimiento: " + estudiantes[2][i]);
            System.out.println("Número de materias: " + estudiantes[3][i]);
        }
    }

    // Función 5: Imprimir estudiantes de un año determinado
    public static void imprimirEstudiantesPorAnio() {
        System.out.print("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();
        boolean encontrado = false;

        System.out.println("Estudiantes nacidos en el año " + anio + ":");
        for (int i = 0; i < estudiantes[0].length; i++) {
            if (estudiantes[2][i] == anio) {
                System.out.println("ID: " + estudiantes[0][i] + ", Edad: " + estudiantes[1][i] + ", Número de materias: " + estudiantes[3][i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron estudiantes nacidos en el año " + anio);
        }
    }

    // Función 6: Calcular promedio de materias
    public static void calcularPromedioMaterias() {
        int totalMaterias = 0;
        for (int i = 0; i < estudiantes[0].length; i++) {
            totalMaterias += estudiantes[3][i];
        }
        double promedio = (double) totalMaterias / estudiantes[0].length;
        System.out.println("El promedio de materias es: " + promedio);
    }
}
