import java.util.*;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }

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

    public float liquidarAlquilerAmarre(int posicionAmarre){
        float precio = -1;
        if(posicionAmarre >= 0 && posicionAmarre < amarres.length && amarres[posicionAmarre] != null){
                precio = amarres[posicionAmarre].getPrecioAlquiler();
                amarres[posicionAmarre] = null;
        }
        return precio;
    }

    public void verEstadoAmarres(){
        for(int posicion = 0 ;posicion < amarres.length;posicion++){
            if(amarres[posicion] == null){
                System.out.println("El amarre " + posicion + " esta libre.");
            }
            else{
                System.out.println("Este amarre se encuentra ocupado");
                System.out.println(amarres[posicion].toString());
            }
        }
    }

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
