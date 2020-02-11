package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Cafeteria cafeteria =new Cafeteria();



    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("¿cuantas mesas tiene tu cafetería?");
        int cantidad=teclado.nextInt();
        for (int i = 1; i < cantidad; i++) cafeteria.addMesa(i);
        System.out.println("tus mesas han sido creadas.\n" +
                "////////////////////////////////////////");
        while(opcion !=7){
            System.out.println("1.consultar mesas abiertas.\n" +
                    "2.Consultar mesas cerradas.\n" +
                    "3.Consultar el recuento de caja actual.\n" +
                    "4.Añadir productos a la carta.\n" +
                    "5.Añadir producto a una mesa.\n" +
                    "6.Cerrar mesa (Cobrarla).\n" +
                    "7.salir del programa.\n");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    ArrayList<Mesa> mesasAbiertas = cafeteria.getMesasAbiertas();
                    System.out.println(mesasAbiertas);
                    break;
                case 2:
                    ArrayList<Mesa> mesasCerradas = cafeteria.getMesasCerradas();
                    System.out.println(mesasCerradas);
                    break;
                case 3:
                    double recuentoCaja = cafeteria.getRecuentoCaja();
                        System.out.println("el recuento de la caja actual es :"+recuentoCaja);
                    break;
                case 4:
                    Scanner teclas = new Scanner(System.in);
                    System.out.println("introduce el nombre del producto");
                    String nombre = teclas.nextLine();
                    System.out.println("introduce el precio del producto");
                    double precio = teclas.nextDouble();
                    cafeteria.addProducto(nombre,precio);
                    System.out.println(cafeteria.carta);
                    break;
                case 5:
                    Scanner key=new Scanner(System.in);
                    Scanner key2=new Scanner(System.in);
                    System.out.println("introduce el número de la mesa:");
                    int numeroMesa=key.nextInt();
                    System.out.println("introduce el nombre del producto:");
                    String nombreProducto=key2.nextLine();
                    System.out.println("/////////////////////////////////// \n" +
                                    "producto añadido.\n" +
                                    "///////////////////////////////////");
                    cafeteria.addProductoAMesa(numeroMesa,nombreProducto);
                    break;
                case 6:
                    Scanner key3=new Scanner(System.in);
                    System.out.println("introduce el número de mesa a cobrar: ");
                    int numMesaCobrar=key3.nextInt();

                    cafeteria.cobrarMesa(numMesaCobrar);
                    System.out.println("mesa cobrada");
                    break;
                case 7:
                    System.out.println("adios.");
                    break;




            }
        }
/*

        init();

        //Añadir producto a una mesa.
        cafeteria.addProductoAMesa(1, "Colacao");
        cafeteria.addProductoAMesa(1, "Mixto");
        cafeteria.addProductoAMesa(2, "Pinta");
        cafeteria.addProductoAMesa(2, "Pinta");
        //Consultar mesas abiertas.
        ArrayList<Mesa> mesasAbiertas = cafeteria.getMesasAbiertas();
        System.out.println(mesasAbiertas);
        //Consultar mesas cerradas.
        ArrayList<Mesa> mesasCerradas = cafeteria.getMesasCerradas();
        System.out.println(mesasCerradas);
        //Consultar el recuento de caja actual.
        double recuentoCaja = cafeteria.getRecuentoCaja();
        //Añadir productos a la lista de productos(Crear nuevo producto).
        cafeteria.addProducto("cafe", 1.20);

        //Cerrar mesa (Cobrarla).
        cafeteria.cobrarMesa(1);
    }

    private static void init() {
        for (int i = 1; i < 17; i++) cafeteria.addMesa(i);
            // -------------------
            String[] nombresProducto = {"Caña", "Pinta", "Carajillo", "Mixto", "Catalana", "Colacao"};
            double[] preciosProducto = {1.00, 3.00, 1.20, 1.50, 1.20, 1.50};
            for (int i = 0; i < nombresProducto.length; i++)
                cafeteria.addProducto(nombresProducto[i], preciosProducto[i]);

  */
        }
    }