import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Empleado> lista = new ArrayList<>();

        Empleado e1 = new EmpleadoFijo("Ibai", 1400, 0, 3);
        Empleado e2 = new EmpleadoFijo("Dmitry", 2000, 1000, 2);
        /* El polimorfismo se encuentra en que en */
        lista.add(e1);
        lista.add(e2);

        Empleado e3 = new EmpleadoTemporal("Laura", 40, 8, 4);
        Empleado e4 = new EmpleadoTemporal("Paula", 35, 8, 8);

        lista.add(e3);
        lista.add(e4);

        for (Empleado i : lista) {
            System.out.println("Nombre: " + i.getNombre() + " | Salario antes: " + i.calcularSalario());
            i.aumentarSalario(10);
            System.out.println("Nombre: " + i.getNombre() + " | Salario después (+10%): " + i.calcularSalario());
            System.out.println("---");
        }
    }
}
