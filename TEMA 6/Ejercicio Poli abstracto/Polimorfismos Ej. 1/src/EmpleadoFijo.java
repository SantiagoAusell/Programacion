public class EmpleadoFijo extends Empleado {
    double bonus;

    public EmpleadoFijo(String nombre, double salarioBase, double porcentaje, double bonus) {
        super(nombre, salarioBase, porcentaje);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        double total = salarioBase + bonus;
        // Bonficación especial si supera 3000
        if (total > 3000) {
            total = (total * 0.10) + total;
        }
        return total;
    }

    @Override
    public void aumentarSalario(double porcentaje) {
        salarioBase = salarioBase + (salarioBase * porcentaje / 100);
    }

    @Override
    public String getTipoEmpleado() {
        return super.getTipoEmpleado() + "Temporal";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre
                + " | Tipo: Empleado Fijo"
                + " | Salario: " + calcularSalario());
    }
}
