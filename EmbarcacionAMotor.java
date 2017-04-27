/**
 * Clase que representa una embarcacion con motor y no con mastiles.
 * @author Miguel RG.
 * @version 27/04/2017.
 */

public class EmbarcacionAMotor extends Barco
{
    
    private int potencia;

    /**
     * Constructor de la clase EmbarcacionAMotor.
     * @param potencia potencia en CV del motor de la embarcacion.
     */
    public EmbarcacionAMotor(String matricula, double eslora, int annoFabricacion, Persona propietario, int potencia)
    {
        super(matricula, eslora, annoFabricacion, propietario);
        this.potencia = potencia;
    }

    /**
     * Devuelve una cadena de String con todos 
     * los datos de los atributos de la clase EmbarcacionAMotor.
     * @return String con los atributos de la clase Barco ,  mas la potencia de la embarcacion.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "La potencia del barco es: " + potencia + " caballos de vapor.\n";
        
        return cadenaADevolver;
    }
    
    /**
     * Devuelve el coeficiente de bernua del Barco
     * que en este caso coincide con la potencia 
     * del Barco.
     * @return Entero que representa el coeficiente de Bernua de esta embarcacion en concreto.
     */
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
}
