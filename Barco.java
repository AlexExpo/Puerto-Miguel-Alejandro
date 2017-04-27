
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    
    private Persona propietario;
    
    private String matricula;
    
    private double eslora;
    
    private int annoFabricacion;

    public Barco(Persona propietario, String matricula, double eslora, int annoFabricacion)
    {
        this.propietario = propietario;
        this.matricula = matricula;
        this.eslora = eslora;
        this.annoFabricacion = annoFabricacion;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Nombre del propietario del barco: " + propietario + ".\n";
        cadenaADevolver += "Matricula del barco: " + matricula + ".\n";
        cadenaADevolver += "La eslora del barco es: " + eslora + " metros.\n";
        cadenaADevolver += "El anno de fabricacion del barco es: " + annoFabricacion + ".\n";
        
        return cadenaADevolver;
    }
    
    public double getEslora()
    {
        return eslora;
    }
    
    abstract int getCoeficienteBernua();
    
}





