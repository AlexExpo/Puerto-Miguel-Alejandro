
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    
    private int numeroMastiles;

    public Velero(Persona propietario, String matricula, double eslora, int annoFabricacion, int numeroMastiles)
    {
        super(propietario, matricula, eslora, annoFabricacion);
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




