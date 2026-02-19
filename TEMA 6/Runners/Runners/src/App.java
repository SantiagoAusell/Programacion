import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Sportsman("Juan");
        Person p2 = new Engineer("Ana");

        System.out.println("Estoy corriendo a" + p1.toRun() + " km/h");
        System.out.println("Estoy corriendo a" + p2.toRun() + " km/h");

        ArrayList<Person> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);

        int total = 0;
        for (Person i : lista) {
            total += total + i.toRun();
        }

        System.out.println("La velocidad media es: " + total / lista.size());
    }
}
