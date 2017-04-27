/**
 * Clase que representa cada uno de los alquileres realizados en el Puerto.
 * @author Miguel RG
 * @version 27/04/2017.
 */

public class Alquiler
{
    //Constantes
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    //Atributos
    private int numDias;
    private int posicionAmarre;
    private Barco barco;
    
    /**
     * Constructor de la clase Alquiler.
     * @param numDias numero de dias para los que se alguila un Barco.
     * @param barco Barco que se alguila.
     * @param posicionAmarre posicion dentro de los amarres disponibles que se pretende alquilar.
     */
    public Alquiler(int numDias ,Barco barco,  int posicionAmarre)
    {
        this.numDias = numDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    /**
     * Devuelve una cadena de String con todos 
     * los datos de los atributos de la clase Alquiler.
     * @return String muestra todos los datos del Alquiler realizado.
     */
    public String toString()
    {
        String cadenaAlquiler = "";
        cadenaAlquiler += "Numero de dias: " + numDias + "\n" + " Posicion del amarre : " + posicionAmarre;
        cadenaAlquiler += "Barco que lo ocupa: " + barco + "\n";
        cadenaAlquiler += "Posicion del amarre : " + posicionAmarre + "\n";
        return cadenaAlquiler;
    }
    
    /**
     * Calcula y devuelve el precio que costaria
     * un determinado alquiler de una amarre del 
     * puerto.
     * @return float precio del alquiler.
     */
    public float getPrecioAlquiler(){
        float precio = -1;
        precio = (numDias * VALOR_MULTIPLICADOR_ESLORA * (float)barco.getEslora()) + (VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());;//Aplicamos la formula para
        return precio;                                                                                                                            //calcular el alquiler.
    }
}





