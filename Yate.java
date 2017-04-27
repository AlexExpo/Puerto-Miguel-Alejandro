
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    
    private int numeroCamarotes;

    public Yate(Persona propietario, String matricula, double eslora, int annoFabricacion, int potencia, int numeroCamarotes)
    {
        super(propietario, matricula, eslora, annoFabricacion, potencia);
        this.numeroCamarotes = numeroCamarotes;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "El numero de camarotes del barco es: " + numeroCamarotes + ".\n";
        
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        int coeficienteBernua = super.getCoeficienteBernua() + numeroCamarotes;
        return coeficienteBernua;
    }
    
}
