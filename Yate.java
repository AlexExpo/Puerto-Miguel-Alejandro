

public class Yate extends EmbarcacionAMotor
{
    
    private int numeroCamarotes;

    public Yate(String matricula, double eslora, int annoFabricacion,  Persona propietario, int potencia, int numeroCamarotes)
    {
        super(matricula, eslora, annoFabricacion, propietario, potencia);
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
