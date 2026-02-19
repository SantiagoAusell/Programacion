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
    }
}
