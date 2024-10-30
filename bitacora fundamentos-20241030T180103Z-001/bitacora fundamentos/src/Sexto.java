public class Sexto {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];  // Creamos la matriz 3x3
        int contador = 1;  // Variable que contendrá los números del 1 al 9
        System.out.println("Matriz 3x3 con los números del 1 al 9:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = contador;
                contador++;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Nueva línea al final de cada fila
        }
    }
}
