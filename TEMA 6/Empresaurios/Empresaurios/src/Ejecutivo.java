public class Ejecutivo extends Empleado {
    int presupuesto;

    public Ejecutivo(String nombre, double sueldo, int presupuesto) {
        super(nombre, sueldo);
        this.presupuesto = presupuesto;
    }

    public Ejecutivo(String nombre, double sueldo, int numEmpleado, int presupuesto) {
        super(nombre, sueldo, numEmpleado);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void asignaPresupuesto(int presup) {
        presupuesto = presup;
    }

    @Override
    public String toString() {
        return super.toString() + " Ejecutivo";
    }

}
