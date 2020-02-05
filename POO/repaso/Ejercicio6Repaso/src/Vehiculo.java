public class Vehiculo {
   private String modelo;
   private String marca;
   private String color;
   private int fechaFab;
   private String combustion;
   private String estado;
   private double precioRecomendado;

    public Vehiculo(String modelo, String marca, String color, int fechaFab, String combustion, String estado, double precioRecomendado) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.fechaFab = fechaFab;
        this.combustion = combustion;
        this.estado = estado;
        this.precioRecomendado = precioRecomendado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(int fechaFab) {
        this.fechaFab = fechaFab;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecioRecomendado() {
        return precioRecomendado;
    }

    public void setPrecioRecomendado(double precioRecomendado) {
        this.precioRecomendado = precioRecomendado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", añoFabricacion=" + fechaFab +
                ", combustion='" + combustion + '\'' +
                ", estado='" + estado + '\'' +
                ", precioAcordado=" + precioRecomendado +
                '}';
    }
}
