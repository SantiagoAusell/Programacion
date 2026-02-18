public class EmpleadoFijo extends Empleado {
    double bonus;

    public EmpleadoFijo(String nombre, double bonus) {
        super(nombre);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
