import java.util.ArrayList;

public class Ejercicio {
    public static void main(String[] args) {
        // Crear un ArrayList con nombres de compañeros de clase
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Sofía");

        // Utilizar un ciclo for mejorado para recorrer y mostrar los nombres
        System.out.println("Nombres de los compañeros de clase:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
