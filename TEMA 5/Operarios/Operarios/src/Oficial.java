/**
 * Clase Oficial - HEREDA de Operario (que a su vez hereda de Empleado)
 * Un Oficial ES UN Operario Y ES UN Empleado (herencia multinivel)
 * 
 * Jerarquía completa: Empleado -> Operario -> Oficial
 * Oficial hereda todo de Operario y de Empleado
 */
public class Oficial extends Operario {

    /**
     * Constructor - Crea un nuevo Oficial con un nombre
     * 
     * @param nombre El nombre del oficial
     */
    public Oficial(String nombre) {
        // super() aquí llama al constructor de OPERARIO (que es su padre directo)
        // Operario a su vez llama al constructor de Empleado
        super(nombre);
    }

    /**
     * @Override - Sobrescribe el toString() heredado de Operario
     *           Muestra la jerarquía completa: Empleado -> Operario -> Oficial
     * @return Una cadena mostrando toda la jerarquía de herencia
     */
    @Override
    public String toString() {
        // Muestra la ruta completa de herencia en el formato
        return "Empleado " + super.getNombre() + " -> Operario " + "->" + " Oficial";
    }
}
