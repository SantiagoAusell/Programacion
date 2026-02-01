public class App {
    public static void main(String[] args) throws Exception {
        Cereales C1 = new Cereales("Kellogs", "Espelta", 3.2);
        Cereales C2 = new Cereales("ChocaPick", "Trigo", 3.9);
        Vino V1 = new Vino("El Coto", "Rioja", 12, 9);
        Vino V2 = new Vino("Miracle", "Ribera del Duero", 11, 12);
        Detergente D1 = new Detergente("Ariel", 10);
        Detergente D2 = new Detergente("Ariel", 10);

        System.out.println(C1);
        System.out.println("");
        System.out.println(C2);
        System.out.println("");
        System.out.println(V1);
        System.out.println("");
        System.out.println(V2);
        System.out.println("");
        System.out.println(D1);
        System.out.println("");
        System.out.println(D2);
        System.out.println("");
        System.out.println(C1.getMarca() + " tiene " + C1.getCalorias() + " calorías");

    }
}
