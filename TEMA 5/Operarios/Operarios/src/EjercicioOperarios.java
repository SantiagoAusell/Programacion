/**
 * Clase principal EjercicioOperarios
 * Contiene el método main() - punto de entrada del programa
 * 
 * Este programa demuestra la HERENCIA en Java con una jerarquía de empleados:
 * 
 * JERARQUÍA DE CLASES:
 * Empleado (clase base)
 * / \
 * Directivo Operario
 * / \
 * Oficial Tecnico
 */
public class EjercicioOperarios {
    /**
     * Método main - Se ejecuta cuando arrancamos el programa
     * 
     * @param args Argumentos de línea de comandos (no se usan aquí)
     * @throws Exception Por si hay algún error durante la ejecución
     */
    public static void main(String[] args) throws Exception {

        // Creamos un objeto de cada tipo de empleado
        // Cada objeto se crea con 'new' y se le pasa el nombre al constructor

        Empleado E1 = new Empleado("Rafa"); // Empleado base
        Directivo D1 = new Directivo("Mario"); // Directivo hereda de Empleado
        Operario OP1 = new Operario("Alfonso"); // Operario hereda de Empleado
        Oficial OF1 = new Oficial("Luis"); // Oficial hereda de Operario
        Tecnico T1 = new Tecnico("Pablo"); // Tecnico hereda de Operario

        // Imprimimos cada objeto - Java llama automáticamente al método toString()
        // Cada clase tiene su propia versión de toString() (@Override)

        System.out.println(E1); // Muestra: "Empleado Rafa"
        System.out.println(D1); // Muestra: "Empleado Mario-> Oficial"
        System.out.println(OP1); // Muestra: "Empleado Alfonso-> Oficial"
        System.out.println(OF1); // Muestra: "Empleado Luis -> Operario -> Oficial"
        System.out.println(T1); // Muestra: "Empleado Pablo -> Operario -> Tecnico"

        // OBSERVA: Oficial y Tecnico muestran toda su jerarquía de herencia
        // porque heredan de Operario, que a su vez hereda de Empleado
    }
}
