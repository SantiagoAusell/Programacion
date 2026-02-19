public class EmpleadoTemporal extends Empleado {
    double horasTrabajadas;
    double pagoPorHora;

    public EmpleadoTemporal(String nombre, double porcentaje, double horasTrabajadas,
            double pagoPorHora) {
        super(nombre, 0, porcentaje);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public void aumentarSalario(double porcentaje) {
        pagoPorHora = pagoPorHora + (pagoPorHora * porcentaje / 100);
    }

    @Override
    public String getTipoEmpleado() {
        return super.getTipoEmpleado() + "Fijo";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre
                + " | Tipo: Empleado Temporal"
                + " | Salario: " + calcularSalario());
    }
}
