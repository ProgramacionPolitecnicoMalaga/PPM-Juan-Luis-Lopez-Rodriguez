package modelo;

public class Cuenta {
    private int numeroCuenta;
    private Mesa mesa;


    public Cuenta(int numeroCuenta, Mesa mesa) {
        this.numeroCuenta = numeroCuenta;
        this.mesa = mesa;
    }

    public double total(){
        double recuento=0;
        for(Producto producto :mesa.getProductos()){
            recuento+=producto.getPrecio();
        }
        return recuento;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}
