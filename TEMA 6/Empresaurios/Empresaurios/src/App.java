import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Empleado> lista = new ArrayList();

        lista.add(new Ejecutivo("Juan", 2400, 1, 0));
        lista.add(new Ejecutivo("Pablo", 3400, 1, 100));
        lista.add(new Administrativo("Antonet", 4400, 1));

        for (Empleado i : lista) {
            System.out.println(i.toString());
        }
    }
}
