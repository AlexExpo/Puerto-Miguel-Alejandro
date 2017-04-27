

public class EmbarcacionAMotor extends Barco
{
    
    private int potencia;

    public EmbarcacionAMotor(String matricula, double eslora, int annoFabricacion, Persona propietario, int potencia)
    {
        super(matricula, eslora, annoFabricacion, propietario);
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
