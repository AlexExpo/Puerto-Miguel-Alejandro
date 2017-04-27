

public abstract class Barco
{
    
    private String matricula;
    
    private double eslora;
    
    private int annoFabricacion;
    
    private Persona propietario;

    public Barco(String matricula, double eslora, int annoFabricacion, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.annoFabricacion = annoFabricacion;
        this.propietario = propietario;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Matricula del barco: " + matricula + ".\n";
        cadenaADevolver += "La eslora del barco es: " + eslora + " metros.\n";
        cadenaADevolver += "El anno de fabricacion del barco es: " + annoFabricacion + ".\n";
        cadenaADevolver += "Nombre del propietario del barco: " + propietario + ".\n";
        
        return cadenaADevolver;
    }
    
    public double getEslora()
    {
        return eslora;
    }
    
    abstract int getCoeficienteBernua();
    
}





