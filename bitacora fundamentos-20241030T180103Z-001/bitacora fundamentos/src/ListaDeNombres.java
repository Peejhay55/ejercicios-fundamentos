import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeNombres {
    public static void main(String[] args) {
        // Crear un ArrayList con nombres de compañeros de clase
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Sofía");

        // Utilizar un Iterator para recorrer y mostrar los nombres
        Iterator<String> iterador = nombres.iterator();

        System.out.println("Nombres de los compañeros de clase:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}

