import java.time.LocalDate;

public abstract class Empleado {
    int id;
    String nombre;
    LocalDate ingreso;
    Double sueldo;
    int promedio;

    public int IdEmpleado() {
        return id;
    }

    public String Nombre() {
        return nombre;
    }

    public Double Sueldo() {
        return sueldo;
    }

    public int Promedio() {
        return promedio;
    }
}
