
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    //Constantes
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int numDias;
    private int posicionAmarre;
    
    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numDias ,Barco barco,  int posicionAmarre)
    {
        this.numDias = numDias;
        this.posicionAmarre = posicionAmarre;
    }

    public String toString()
    {
        String cadenaAlquiler = "";
        cadenaAlquiler += "Numero de dias : " +numDias + "\n" + " Posicion del amarre : " + posicionAmarre;
        return cadenaAlquiler;
    }
    
    public float getPrecioAlquiler(){
        float precio = -1;
        precio = numDias + (barco.getEslora() * VALOR_MULTIPLICADOR_ESLORA) +(VALOR_MULTIPLICADOR_BERNUA *barco.getCoeficienteDeBernua());
        return precio;
    }
}
