import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Empleado> lista = new ArrayList<>();

        Empleado e1 = new EmpleadoFijo("Ibai", 0);
        Empleado e2 = new EmpleadoFijo("Dmitry", 1000);

        lista.add(e1);
        lista.add(e2);

        Empleado e3 = new EmpleadoTemporal("Laura", 40, 8);
        Empleado e4 = new EmpleadoTemporal("Paula", 35, 8);

        lista.add(e3);
        lista.add(e4);

        for (Empleado i : lista) {
            System.out.println("Nombre " + i.getNombre() + " Salario " + i.calcularSalario());
        }
    }
}
