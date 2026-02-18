public class EmpleadoTemporal extends Empleado {
    double horasTrabajadas;
    double pagoPorHora;

    public EmpleadoTemporal(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }
}
