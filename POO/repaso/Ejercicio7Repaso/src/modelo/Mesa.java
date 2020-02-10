package modelo;

import java.util.ArrayList;

public class Mesa {
    private int numeroMesa;
    private boolean cerrada;
    private ArrayList<Producto> productos;

        public Mesa(int numeroMesa){
           this.numeroMesa=numeroMesa;
            cerrada=true;

        }

        public void addProducto(Producto producto){
            productos.add(producto);
            cerrada=false;


        }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numeroMesa=" + numeroMesa +
                ", cerrada=" + cerrada +
                ", productos=" + productos +
                '}';
    }
}
