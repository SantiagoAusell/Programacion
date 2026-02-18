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

    /*
     * En caso de hacer esta clase abstracta lo que ocurriria es que no podriamos
     * crear un objeto
     * que llame a esta clase directamente, tambien obligamos a las clases hijas a
     * cumplir el metodo
     * y organizamos todo de mejor manera
     */
}
