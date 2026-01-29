/**
 * Clase Operario - HEREDA de Empleado (extends Empleado)
 * Un Operario ES UN Empleado (relación de herencia)
 * Esta clase representa a los operarios de la empresa
 * 
 * IMPORTANTE: Operario también es clase PADRE de Oficial y Tecnico
 * Jerarquía: Empleado -> Operario -> Oficial/Tecnico
 */
public class Operario extends Empleado {

    /**
     * Constructor - Crea un nuevo Operario con un nombre
     * 
     * @param nombre El nombre del operario
     */
    public Operario(String nombre) {
        // super() llama al constructor de Empleado para inicializar el nombre
        super(nombre);
    }

    /**
     * @Override - Sobrescribe el toString() heredado de Empleado
     *           Cambia la forma en que se muestra un Operario
     * @return Una cadena con el formato: "Empleado [nombre]-> Oficial"
     */
    @Override
    public String toString() {
        // Usamos super.getNombre() para acceder al nombre desde la clase padre
        return "Empleado " + super.getNombre() + "-> Oficial";
    }

}
