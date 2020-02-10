package modelo;

import java.util.ArrayList;

public class Caja {
    private int identificadorCuentaActual;
    private ArrayList<Cuenta>cuentas;

    public Caja() {
        this.identificadorCuentaActual = 0;
        this.cuentas = new ArrayList<>();
    }

    public void pedirNuevaCuenta(Mesa mesa){
        Cuenta cuenta=new Cuenta(identificadorCuentaActual,mesa);
        identificadorCuentaActual++;
        cuentas.add(cuenta);
        mesa.setCerrada(true);
    }

    public double recuento(){
        double recuento=0;
        for(Cuenta cuenta : cuentas){
            recuento+=cuenta.total();
        }

        return recuento;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
