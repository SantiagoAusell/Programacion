public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected double porcentaje;

    public Empleado(String nombre, double salarioBase, double porcentaje) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public abstract void aumentarSalario(double porcentaje);

    /*
     * En caso de hacer esta clase abstracta lo que ocurriria es que no podriamos
     * crear un objeto
     * que llame a esta clase directamente, tambien obligamos a las clases hijas a
     * cumplir el metodo
     * y organizamos todo de mejor manera
     */
}
