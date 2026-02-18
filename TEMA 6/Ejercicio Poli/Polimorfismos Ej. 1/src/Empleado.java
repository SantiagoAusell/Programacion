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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
