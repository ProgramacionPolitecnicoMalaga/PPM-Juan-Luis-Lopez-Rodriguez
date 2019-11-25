import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Jugador {
    private String color;
    private String nombreJugador;
    private int casillaActual;
    private ArrayList<Integer> historial;
    private int posicionHistorial;

    public Jugador(String color, String nombreJugador) {
        this.color = color;
        this.nombreJugador = nombreJugador;
        this.casillaActual =1;
        this.historial=new ArrayList<>();
        this.posicionHistorial=-1;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(int casillaActual) {
        this.casillaActual = casillaActual;
    }

    public void avanzarCasillas(int avances){
        casillaActual+=avances;

        Iterator<Integer> iterator = historial.iterator();
        int i=0;
        while (iterator.hasNext()) {
            iterator.next();
             if(i>posicionHistorial) {
                 iterator.remove();
             }
             i++;
        }

        historial.add(casillaActual);
        posicionHistorial++;

    }

    public void retrocederACasilla(int retrocesos){
        casillaActual=retrocesos;
        historial.add(casillaActual);
        posicionHistorial++;
    }

    public void historial(){
        System.out.println("historial de posiciones"+historial);
}
    public void undo(){
        if(posicionHistorial>0) {
            posicionHistorial--;
            System.out.println(historial.get(posicionHistorial));
            casillaActual=historial.get(posicionHistorial);
        }
    }
    public void redo() {
        if (posicionHistorial + 1 < historial.size()) {
            posicionHistorial++;
            System.out.println(historial.get(posicionHistorial));
            casillaActual = historial.get(posicionHistorial);
        } else {
            System.out.println("no puedes rehacer,vuelve a tirar");
        }
    }
    @Override
    public String toString() {
        return "casillaActual: " + casillaActual+";historial: "+historial+";possicion historial: " +posicionHistorial;

    }
}
