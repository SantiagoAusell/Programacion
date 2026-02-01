import java.time.LocalDate;

public class Vino implements ConDescuento, EsAlimento, EsLiquido {

    private String tipoVino;
    private String marca;
    private int grados;
    private double precio;
    double descuento;
    double volumen;
    String tipoEnvase;
    LocalDate caducidad;

    public Vino(String tipoVino, String marca, int grados, double precio) {
        this.tipoVino = tipoVino;
        this.marca = marca;
        this.grados = grados;
        this.precio = precio;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - descuento;
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        return grados * 10;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public String toString() {
        return "Vino:\n" +
                "marca =" + marca + "\n" +
                "Tipo de vino =" + tipoVino + "\n" +
                "grados =" + grados + "\n" +
                "Precio =" + precio;
    }

}
