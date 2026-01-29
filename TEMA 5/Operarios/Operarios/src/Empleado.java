/**
 * Clase base Empleado - Esta es la clase PADRE de toda la jerarquía
 * Representa un empleado genérico con un nombre
 * Las demás clases (Directivo, Operario, Oficial, Tecnico) heredarán de esta
 * clase
 */
public class Empleado {

    // Atributo privado que guarda el nombre del empleado
    // Al ser private, solo se puede acceder desde esta clase usando getNombre() y
    // setNombre()
    private String nombre;

    /**
     * Constructor con parámetro - Se usa para crear un empleado con nombre
     * 
     * @param nombre El nombre del empleado
     */
    public Empleado(String nombre) {
        this.nombre = nombre; // 'this' se refiere al atributo de la clase
    }

    /**
     * Constructor vacío - Se usa para crear un empleado sin nombre inicialmente
     * El nombre se puede asignar después usando setNombre()
     */
    public Empleado() {
    }

    /**
     * Setter - Método para cambiar/establecer el nombre del empleado
     * 
     * @param nombre El nuevo nombre para el empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter - Método para obtener el nombre del empleado
     * 
     * @return El nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * toString() - Método que devuelve una representación en texto del empleado
     * Se llama automáticamente cuando hacemos System.out.println(empleado)
     * 
     * @return Una cadena con la información del empleado
     */
    public String toString() {
        return "Empleado " + nombre;
    }

}
