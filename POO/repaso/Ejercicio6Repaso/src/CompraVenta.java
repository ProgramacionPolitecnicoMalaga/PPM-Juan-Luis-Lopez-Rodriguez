public class CompraVenta {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String tipo;//compra o venta
    private double precioFinal;



    public CompraVenta(Cliente cliente, Vehiculo vehiculo, String tipo, double precioAcordado) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tipo = tipo;
        this.precioFinal = precioAcordado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public String toString() {
        return "CompraVenta{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", tipo='" + tipo + '\'' +
                ", precioFinal=" + precioFinal +
                '}';
    }
}


