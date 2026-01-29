/**
 * Clase Tecnico - HEREDA de Operario (que a su vez hereda de Empleado)
 * Un Técnico ES UN Operario Y ES UN Empleado (herencia multinivel)
 * 
 * Jerarquía completa: Empleado -> Operario -> Tecnico
 * Tecnico hereda todo de Operario y de Empleado
 * 
 * Nota: Tecnico y Oficial son clases "hermanas" porque ambas heredan de
 * Operario
 */
public class Tecnico extends Operario {

    /**
     * Constructor - Crea un nuevo Técnico con un nombre
     * 
     * @param nombre El nombre del técnico
     */
    public Tecnico(String nombre) {
        // super() aquí llama al constructor de OPERARIO (su padre directo)
        // Operario a su vez llama al constructor de Empleado
        super(nombre);
    }

    /**
     * @Override - Sobrescribe el toString() heredado de Operario
     *           Muestra la jerarquía completa: Empleado -> Operario -> Tecnico
     * @return Una cadena mostrando toda la jerarquía de herencia
     */
    @Override
    public String toString() {
        // Muestra la ruta completa de herencia en el formato
        return "Empleado " + super.getNombre() + " -> Operario " + "->" + " Tecnico";
    }

}
