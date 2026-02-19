public class EmpleadoFijo extends Empleado {
    double bonus;

    public EmpleadoFijo(String nombre, double salarioBase, double porcentaje, double bonus) {
        super(nombre, salarioBase, porcentaje);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public void aumentarSalario(double porcentaje) {
        salarioBase = salarioBase + (salarioBase * porcentaje / 100);
    }
}
