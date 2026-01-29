public class Detergente implements EsLiquido, ConDescuento {
    String marca;
    Double precio;

    public Detergente(String marca, Double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    // Getter y Setter para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter y Setter para precio
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
