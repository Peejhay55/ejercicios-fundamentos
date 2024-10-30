import java.util.Scanner;
import java.util.Random;

public class Onceavo {
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.print("Introduce el tamaño de la matriz (n x n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    llenarMatrizUsuario(matriz);
                    break;
                case 2:
                    llenarMatrizAleatoria(matriz);
                    break;
                case 3:
                    imprimirMatriz(matriz);
                    break;
                case 4:
                    System.out.println("Suma de fila: " + sumaFila(matriz));
                    break;
                case 5:
                    System.out.println("Suma de columna: " + sumaColumna(matriz));
                    break;
                case 6:
                    imprimirDiagonalPrincipal(matriz);
                    break;
                case 7:
                    System.out.println("Suma de diagonal principal: " + sumaDiagonalPrincipal(matriz));
                    break;
                case 8:
                    System.out.println("Suma de todos los valores: " + sumaTotal(matriz));
                    break;
                case 9:
                    System.out.println("Promedio de todos los valores: " + promedio(matriz));
                    break;
                case 10:
                    encontrarMaximo(matriz);
                    break;
                case 11:
                    encontrarMinimo(matriz);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Llenar matriz con números del usuario");
        System.out.println("2. Llenar matriz con números aleatorios");
        System.out.println("3. Imprimir matriz");
        System.out.println("4. Sumar una fila");
        System.out.println("5. Sumar una columna");
        System.out.println("6. Imprimir diagonal principal");
        System.out.println("7. Sumar diagonal principal");
        System.out.println("8. Sumar todos los valores");
        System.out.println("9. Promedio de los valores");
        System.out.println("10. Encontrar el valor máximo");
        System.out.println("11. Encontrar el valor mínimo");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void llenarMatrizUsuario(int[][] matriz) {
        System.out.println("Introduce los números para llenar la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void llenarMatrizAleatoria(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatorios entre 0 y 99
            }
        }
        System.out.println("Matriz llenada con números aleatorios.");
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumaFila(int[][] matriz) {
        System.out.print("Introduce el número de fila (0 a " + (matriz.length - 1) + "): ");
        int fila = sc.nextInt();
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz) {
        System.out.print("Introduce el número de columna (0 a " + (matriz.length - 1) + "): ");
        int columna = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static void imprimirDiagonalPrincipal(int[][] matriz) {
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println();
    }

    public static int sumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int sumaTotal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static double promedio(int[][] matriz) {
        int suma = sumaTotal(matriz);
        int totalElementos = matriz.length * matriz[0].length;
        return (double) suma / totalElementos;
    }

    public static void encontrarMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
        int filaMax = 0, columnaMax = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
        }
        System.out.println("El valor máximo es " + maximo + " en la posición (" + filaMax + "," + columnaMax + ").");
    }

    public static void encontrarMinimo(int[][] matriz) {
        int minimo = matriz[0][0];
        int filaMin = 0, columnaMin = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                    filaMin = i;
                    columnaMin = j;
                }
            }
        }
        System.out.println("El valor mínimo es " + minimo + " en la posición (" + filaMin + "," + columnaMin + ").");
    }
}

