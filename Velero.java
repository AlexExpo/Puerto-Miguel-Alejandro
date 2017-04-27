

public class Velero extends Barco
{
    
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int annoFabricacion, Persona propietario, int numeroMastiles)
    {
        super(matricula, eslora, annoFabricacion, propietario);
        this.numeroMastiles = numeroMastiles;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "El numero de mastiles del barco es: " + numeroMastiles + ".\n";
        
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return numeroMastiles;
    }
    
}


