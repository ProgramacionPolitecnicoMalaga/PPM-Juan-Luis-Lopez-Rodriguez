package modelo;

import java.util.ArrayList;

public class Main {
    private static Cafeteria cafeteria;
    public static void main(String[] args) {

        cafeteria = new Cafeteria();
        init();

        //Añadir producto a una mesa.
        cafeteria.addProductoAMesa(1,"Colacao");
        cafeteria.addProductoAMesa(1,"Mixto");
        cafeteria.addProductoAMesa(2,"Pinta");
        cafeteria.addProductoAMesa(2,"Pinta");
        //Consultar mesas abiertas.
        ArrayList<Mesa> mesasAbiertas = cafeteria.getMesasAbiertas();
        System.out.println(mesasAbiertas);
        //Consultar mesas cerradas.
        ArrayList<Mesa> mesasCerradas = cafeteria.getMesasCerradas();
        System.out.println(mesasCerradas);
        //Consultar el recuento de caja actual.
        double recuentoCaja = cafeteria.getRecuentoCaja();
        //Añadir productos a la lista de productos(Crear nuevo producto).
        cafeteria.addProducto("cafe",1.20);

        //Cerrar mesa (Cobrarla).
        cafeteria.cobrarMesa(1);
    }

    private static void init(){
        for (int i=1; i<17; i++)
            cafeteria.addMesa(i);
        // -------------------
        String[] nombresProducto = {"Caña","Pinta","Carajillo","Mixto","Catalana","Colacao"};
        double[] preciosProducto = {1.00,3.00,1.20,1.50,1.20,1.50};
        for (int i=0; i<nombresProducto.length; i++)
            cafeteria.addProducto(nombresProducto[i],preciosProducto[i]);
    }
}
