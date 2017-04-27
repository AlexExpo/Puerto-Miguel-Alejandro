/**
 * Clase yate que pertenece a EmbarcacionAMotor , añadiendo ademas camarotes.
 * @author Miguel RG.
 * @version 27/04/2017.
 */

public class Yate extends EmbarcacionAMotor
{
    
    private int numeroCamarotes;

    /**
     * Constructor de la clase Yate.
     * @param numeroCamarotes Entero con el numero de camarotes del yate.
     */
    public Yate(String matricula, double eslora, int annoFabricacion,  Persona propietario, int potencia, int numeroCamarotes)
    {
        super(matricula, eslora, annoFabricacion, propietario, potencia);
        this.numeroCamarotes = numeroCamarotes;
    }

    /**
     * Devuelve una cadena de String con todos 
     * los datos de los atributos de la clase Yate.
     * @return String con los datos de Barco, la potencia de EmbarcacionAMotor y ademas los camarotes del Yate.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "El numero de camarotes del barco es: " + numeroCamarotes + ".\n";
        
        return cadenaADevolver;
    }
    
    /**
     * Devuelve el coeficiente de bernua del Barco
     * calculandolo previamente.
     * @return Entero con el coeficiente de Bernua de este yate.
     */
    public int getCoeficienteBernua()
    {
        int coeficienteBernua = super.getCoeficienteBernua() + numeroCamarotes;
        return coeficienteBernua;
    }
    
}
