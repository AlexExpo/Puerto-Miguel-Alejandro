/**
 * representa el Puerto con el que se realizan los alquileres de los amarres.
 * @author Miguel RG.
 * @version 27/04/2017.
 */
import java.util.*;

public class Puerto
{
    private Alquiler[] amarres;

    /**
     * Constructor de la clase Puerto.
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }

    /**
     * Metodo para alquiler un amarre, si no hay
     * amarres disponibles, el metodo devolvera -1.
     * En caso de quedar amarres libres, alquilara el 
     * primero que se encuentre disponible.
     * @param numDias numero de dias que se alquilara el amarre.
     * @param barco Barco que se pretende alquilar.
     * @return el precio del Alquiler realizado.
     */
    public float alquilarAmarre(int numDias , Barco barco){
        float precio = -1;
        int posicionLibre = posicionPrimerAmarreLibre();
        if(hayAmarresLibres()){
            Alquiler nuevoAlquiler = new Alquiler(numDias, barco, posicionLibre);
            amarres[posicionLibre] = nuevoAlquiler;
            precio = nuevoAlquiler.getPrecioAlquiler();
        }
        return precio;
    }

    /**
     * Liquida y por lo tanto elimina del array 
     * de Alquiler (amarres) la posicion del alquiler 
     * que le pases al metodo como parametro.
     * @param posicionAmarre posicion del array que se pretende alquilar.
     * @return el precio del Alquiler realizado.
     */
    public float liquidarAlquilerAmarre(int posicionAmarre){
        float precio = -1;
        if(posicionAmarre >= 0 && posicionAmarre < amarres.length && amarres[posicionAmarre] != null){ 
                precio = amarres[posicionAmarre].getPrecioAlquiler();
                amarres[posicionAmarre] = null;
        }
        return precio;
    }

    /**
     * Metodo que imprime por pantalla el estado 
     * de los amarres, es decir, imprimira si un 
     * amarre se encuentra libre o imprimira si 
     * un amarre se encuentra ocupado y los datos 
     * correspondientes al alquiler de ese amarre.
     */
    public void verEstadoAmarres(){
        for(int posicion = 0 ;posicion < amarres.length; posicion++){
            if(amarres[posicion] == null){
                System.out.println("El amarre " + posicion + " esta libre.");
            }
            else{
                System.out.println("Este amarre se encuentra ocupado");
                System.out.println(amarres[posicion].toString());//Imprime por pantalla los datos del alquiler.
            }
        }
    }

    /**
     * Metodo que devuelve la posicion del
     * primer amarres que se encuentre disponible.
     * En caso de no haber un amarre libre, el 
     * metodo devuelve -1.
     * @return posicion del primer amarre libre encontrado.
     */
    private int posicionPrimerAmarreLibre(){
        int posicion = -1;
        boolean parado = false;
        int index = 0;
        while(parado == false && index < amarres.length){
            if(amarres[index] == null){
                posicion = index;
                parado = true;
            }
            index++;
        }
        return posicion;
    }

    /**
     * Metodo que devuelve true en caso
     * de quedar algun amarre libre o 
     * false en caso de no haber amarres
     * disponibles.
     * @return true en caso de que exista un amarre no alquilado.
     */
    private boolean hayAmarresLibres(){
        boolean libre = false;
        int contador = 0;
        while(!libre && contador < amarres.length){
            if(amarres[contador] == null){
                libre = true;
            }
            contador++;
        }
        return libre;
    }
}
