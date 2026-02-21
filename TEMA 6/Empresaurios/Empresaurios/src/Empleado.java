public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected int numEmpleado;

    public Empleado(String nombre, double sueldo, int numEmpleado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.numEmpleado = numEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", numEmpleado=" + numEmpleado + "]";
    }

    public void aumentarSueldo(double porcentaje) {
        sueldo = sueldo + (sueldo * porcentaje / 100);
    }

    public void ascender(Empleado emp) {
        Ejecutivo e1 = new Ejecutivo(emp.getNombre(), emp.getSueldo(), emp.getNumEmpleado());
    }w

}
