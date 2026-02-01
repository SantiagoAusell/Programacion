import java.time.LocalDate;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    LocalDate caducidad;
    private int calorias;

    public Cereales(String marca, String tipoCereal, double precio) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    // Métodos de la interfaz EsAlimento
    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        if (tipoCereal.equals("espelta")) {
            this.calorias = 5;
        }
        if (tipoCereal.equals("Maíz")) {
            this.calorias = 8;
        }
        if (tipoCereal.equals("Trigo")) {
            this.calorias = 8;
        } else {
            this.calorias = 15;
        }
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;

    }

    @Override
    public String toString() {
        return "Cereales:\n" +
                "Marca=" + marca + "\n" +
                "Precio=" + precio + "\n" +
                "Tipo de Cereal=" + tipoCereal + "\n" +
                "Calorías=" + calorias + "\n" +
                "Caducidad=" + caducidad;
    }
}
