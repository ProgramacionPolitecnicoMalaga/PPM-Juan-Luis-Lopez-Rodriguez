package modelo;

import java.util.ArrayList;
import java.util.TreeMap;

public class Cafeteria {
    TreeMap<Integer, Mesa> mesas;
    TreeMap<String, Producto> carta;
    private Caja caja;

    public Cafeteria() {
        mesas = new TreeMap<>();
        carta = new TreeMap<>();
        caja = new Caja();
    }

    public void addMesa(int numeroMesa) {
        mesas.put(numeroMesa, new Mesa(numeroMesa));
    }

    public void addProducto(String nombreProducto, double precio) {
        Producto producto = new Producto(nombreProducto, precio);
        carta.put(nombreProducto, producto);
    }

    public void addProductoAMesa(int numeroMesa, String nombreProducto) {
        Mesa mesa = mesas.get(numeroMesa);
        Producto producto = carta.get(nombreProducto);
        if ((mesa != null) && (producto != null))
            mesa.addProducto(producto);
    }

    public ArrayList<Mesa> getMesasAbiertas() {
        ArrayList<Mesa> mesasAbiertas = new ArrayList<>();
        for (Integer numeroMesa : mesas.keySet()) {
            Mesa mesa = mesas.get(numeroMesa);
            if (!mesa.isCerrada()) {
                mesasAbiertas.add(mesa);
            }
        }

        return mesasAbiertas;
    }

    public ArrayList<Mesa> getMesasCerradas() {
        ArrayList<Mesa> mesasCerradas = new ArrayList<>();
        for (Integer numeroMesa : mesas.keySet()) {
            Mesa mesa = mesas.get(numeroMesa);
            if (mesa.isCerrada()) {
                mesasCerradas.add(mesa);
            }
        }

        return mesasCerradas;
    }

    public double getRecuentoCaja(){
        return caja.recuento();
    }

    public void cobrarMesa(int numeroMesa){
        Mesa mesa=mesas.get(numeroMesa);
        caja.pedirNuevaCuenta(mesa);
    }

}