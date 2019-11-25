import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Jugador jugador1 = new Jugador("azul", "jugador1");
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("elige una de las opciones:\n" +
                    "1.lanza el dado\n" +
                    "2.Sal del juego\n" +
                    "3.Mostrar Historal\n" +
                    "4.Retoceder\n" +
                    "5.Rehacer");

            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    int tiradaActual = dado.tirada();
                    if(tiradaActual<7){
                        jugador1.avanzarCasillas(tiradaActual);
                        System.out.println("tirada actual =" + tiradaActual);
                        System.out.println(jugador1);
                    }else{
                        Random random = new Random();

                        int tiradaRetroceso=random.nextInt(jugador1.getCasillaActual());
                        jugador1.retrocederACasilla(tiradaRetroceso);
                        System.out.println("has retrocedido a la casilla"+ tiradaRetroceso);
                        System.out.println(jugador1);
                    }
                    break;

                case 3:
                jugador1.historial();
                break;
                case 2:
                    System.out.println("adios.");
                    break;
                case 4:
                    jugador1.undo();

                    System.out.println(jugador1.toString());

                    break;
                case 5:
                    jugador1.redo();
                    System.out.println(jugador1);
                    break;
            }
        } while (opcion != 2);

    }
}
