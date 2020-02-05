import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Main {

    public static void realizarCompraVenta(Concesionario concesionario, String tipo) {
        Scanner teclado = new Scanner(System.in);
        boolean cancelado = false;
        //realizar compra o venta
        System.out.println("3-Realizar " + tipo + " de vehículo a un cliente");

        // Escoger un vehiculo
        concesionario.recorrerListaVehiculos();
        int posicionVehiculo;
        do {
            System.out.println("Elige el vehiculo o escribe -1 para cancelar");
            posicionVehiculo = teclado.nextInt();
        } while (posicionVehiculo < -1 || posicionVehiculo > concesionario.getListaVehiculos().size());

        if (posicionVehiculo == -1) {
            cancelado = true;
            System.out.println("La " + tipo + " ha sido cancelada");
        } else {
            System.out.println("escogido " + posicionVehiculo);
        }

        int posicionCliente = 0;
        if (cancelado == false) {
            //Escoger un cliente
            concesionario.recorrerListaClientes();
            do {
                System.out.println("elige un cliente o escribre -1 para cancelar");
                posicionCliente = teclado.nextInt();
            } while (posicionCliente < -1 || posicionCliente > concesionario.getListaClientes().size());

            if (posicionCliente == -1) {
                System.out.println("La " + tipo + " ha sido cancelada");
                cancelado = true;
            } else {
                System.out.println("el cliente elegido es :" + posicionCliente);
            }
        }

        // Montar objeto CompraVenta
        if (cancelado == false) {
            System.out.println("introduce el precio de " + tipo + " del vehiculo =");
            double precio = teclado.nextDouble();

            concesionario.anadirCompraVenta(posicionCliente, posicionVehiculo, tipo, precio);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //crear concesionario.
        Concesionario miConcesionario = new Concesionario();

        int opcion = 100000; //el valor da igual pero tiene que ser diferente de 5 para que entre al bucle
        while (opcion != 6) {
            System.out.println("elige una de las opciones disponibles:\n" +
                    "1.introducir nuevo vehículo.\n" +
                    "2.introducir nuevo cliente.\n" +
                    "3.realizar una venta de un vehiculo.\n" +
                    "4.realizar una compra de un vehículo.\n" +
                    "5.balance de compras/ventas.\n" +
                    "6.salir del programa\n");

            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    //introducir un vehiculo y mostrarlo.
                    System.out.println("1-Introducción de nuevo vehículo en el sistema");
                    System.out.println("introduce modelo: ");
                    String modelo = teclado.next();
                    String marca = "seat";
                    String color = "rojo";
                    int fechaFab = 2010;
                    String combustion = "diesel";
                    String estado = "usado";
                    double precioAcordado = 2000;
                    miConcesionario.introducirVehiculo(modelo, marca, color, fechaFab, combustion, estado, precioAcordado);
                    break;
                case 2:
                    //introducir cliente y mostrarlo.
                    System.out.println("2-Introducción de nuevo cliente en el sistema");
                    String nombre = "pepe";
                    String apellidos = "apellidos";
                    String nif = "23123123";
                    double cuentaBancaria = 234234234;
                    miConcesionario.introducirCliente(nombre, apellidos, nif, cuentaBancaria);
                    miConcesionario.recorrerListaClientes();

                    break;
                case 3:
                    realizarCompraVenta(miConcesionario, "venta");

                    break;
                case 4:
                    realizarCompraVenta(miConcesionario, "compra");
                    break;
                case 5:
                    int posicionCliente=0;

                    //Escoger un cliente
                    miConcesionario.recorrerListaClientes();
                    do {
                        System.out.println("elige un cliente o escribre -1 para cancelar");
                        posicionCliente = teclado.nextInt();
                    } while (posicionCliente < -1 || posicionCliente > miConcesionario.getListaClientes().size());

                    if (posicionCliente == -1) {
                        System.out.println("La operación ha sido cancelada");
                    } else {
                        System.out.println("el cliente elegido es :" + posicionCliente);
                        miConcesionario.calcularBalance(posicionCliente);
                    }






            break;
                case 6:
                    //salir del programa.
                    System.out.println("Adios.");
                    break;
            }
        }
    }
}