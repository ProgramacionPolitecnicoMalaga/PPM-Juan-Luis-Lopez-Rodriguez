import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<CompraVenta> listaCompraVentas = new ArrayList<>();


    public void introducirVehiculo(String modelo, String marca, String color, int fechaFab, String combustion, String estado, double precioAcordado) {
        Vehiculo vehiculo = new Vehiculo(modelo, marca, color, fechaFab, combustion, estado, precioAcordado);
        listaVehiculos.add(vehiculo);
        System.out.println("Se ha intrucido con exito el vehiculo: " + vehiculo);
    }

    public void introducirCliente(String nombre, String apellidos, String nif, double cuentaBancaria) {
        Cliente cliente = new Cliente(nombre, apellidos, nif, cuentaBancaria);
        listaClientes.add(cliente);
    }


    public void anadirCompraVenta(int posicionCliente,int posicionVehiculo,String tipo,double precio) {
        CompraVenta compraVenta = new CompraVenta(listaClientes.get(posicionCliente), listaVehiculos.get(posicionVehiculo), tipo, precio);
        if (tipo.equals("venta")) {
            Cliente cliente = listaClientes.get(posicionCliente);
            cliente.setCuentaBancaria(cliente.getCuentaBancaria() - precio);
        } else if (tipo.equals("compra")) {
            Cliente cliente = listaClientes.get(posicionCliente);
            cliente.setCuentaBancaria(cliente.getCuentaBancaria() + precio);
        }
        listaCompraVentas.add(compraVenta);
    }

    public void recorrerListaClientes() {
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(i + " - " + listaClientes.get(i));
        }
    }

    public void recorrerListaVehiculos() {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            System.out.println(i + " - " + listaVehiculos.get(i));
        }
    }

    public void calcularBalance(int posicionCliente){
        Cliente cliente =listaClientes.get(posicionCliente);

        double balance=0;
        for(CompraVenta compraVenta :listaCompraVentas){
            if(compraVenta.getCliente().equals(cliente)){
                if(compraVenta.getTipo().equals("compra")){
                   balance=balance-compraVenta.getPrecioFinal();
                }else{
                    balance=balance + compraVenta.getPrecioFinal();
                }
            }
        }
        System.out.println("el balance es "+balance);
    }





    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<CompraVenta> getListaCompraVentas() {
        return listaCompraVentas;
    }

    public void setListaCompraVentas(ArrayList<CompraVenta> listaCompraVentas) {
        this.listaCompraVentas = listaCompraVentas;
    }
}

