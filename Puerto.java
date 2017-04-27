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
        amarres = Alquiler[4];
    }

    public float alquilarAmarre(int numDias , Barco barco){
        float precio = -1;
        if(hayAmarresLibres()){
            int posicionPrimerAmarreLibre = posicionPrimerAmarreLibre();
            Alquiler nuevoAlquiler = new Alquiler(numDias, barco , posicionPrimerAmarreLibre);
            amarres[posicionPrimerAmarreLibre] = nuevoAlquiler;
            precio = nuevoAlquiler.getPrecioAlquiler();
        }
        return precio;
    }

    public float liquidarAlquilerAmarre(int posicionAmarre){
        float precio = -1;
        if(posicionAmarre > 0 && posicionAmarre < amarres.length){
            if(amarres[posicionAmarre] != null){
                precio = amarres[posicionAmarre].getPrecioAlquiler();
                amarres[posicionAmarre] = null;
            }
        }
        return precio;
    }

    public void verEstadoAmarres(){
        for(int posicion ;posicion < amarres.length;posicion++){
            if(amarres[posicion] != null){
                System.out.println("El amarre " + posicion + " esta libre.");
            }
            else{
                System.out.println("Este amarre se encuentra ocupado");
            }
        }
    }

    private int posicionPrimerAmarreLibre(){
        int posicion = -1;
        for(int index = 0;index < amarres.length ; index++){
            if(amarres[index] == null){
                posicion = index;
            }
        }
        return posicion;
    }

    private boolean hayAmarresLibres(){
        boolean libre = false;
        for(int contador = 0; contador < amarres.length() ;contador++){
            if(amarre[contador] != null){
                libre = true;
            }
        }
        return libre;
    }
}
