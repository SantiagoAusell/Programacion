/**
 * Clase Directivo - HEREDA de Empleado (extends Empleado)
 * Un Directivo ES UN Empleado (relación de herencia)
 * Esta clase representa a los directivos de la empresa
 */
public class Directivo extends Empleado {

    /**
     * Constructor - Crea un nuevo Directivo con un nombre
     * 
     * @param nombre El nombre del directivo
     */
    public Directivo(String nombre) {
        // super() llama al constructor de la clase PADRE (Empleado)
        // Esto inicializa el atributo 'nombre' heredado de Empleado
        super(nombre);
    }

    /**
     * @Override significa que estamos SOBRESCRIBIENDO el método toString() de la
     *           clase padre
     *           Esto permite que un Directivo se muestre de forma diferente a un
     *           Empleado normal
     * @return Una cadena con el formato: "Empleado [nombre]-> Oficial"
     */
    @Override
    public String toString() {
        // super.getNombre() llama al método getNombre() de la clase padre (Empleado)
        return "Empleado " + super.getNombre() + "-> Oficial";
    }
}
