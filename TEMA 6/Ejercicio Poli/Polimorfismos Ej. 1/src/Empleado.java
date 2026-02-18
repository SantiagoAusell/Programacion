public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.salarioBase = 1221;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
