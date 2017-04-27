
/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    
    private int potencia;

    public EmbarcacionAMotor(Persona propietario, String matricula, double eslora, int annoFabricacion, int potencia)
    {
        super(propietario, matricula, eslora, annoFabricacion);
        this.potencia = potencia;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "La potencia del barco es: " + potencia + " caballos de vapor.\n";
        
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
}
