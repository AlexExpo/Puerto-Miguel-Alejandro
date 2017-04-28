/**
* Representa un Barco que tendra, ademas de su informacion general
* un propietario de tipo Persona.
* @author Alejandro Exposito.
* @version 27/04/2017.
*/

public abstract class Barco
{
    
    private String matricula;
    private double eslora;
    private int annoFabricacion;
    private Persona propietario;

    /**
     * Constructor de la clase Barco.
     * @param matricula La matricula del Barco.
     * @param eslora la eslora del Barco.
     * @param annoFabricacion el año en el que se fabrico el Barco.
     * @param propietario Persona a la que pertenece el Barco.
     */
    public Barco(String matricula, double eslora, int annoFabricacion, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.annoFabricacion = annoFabricacion;
        this.propietario = propietario;
    }

    /**
     * Devuelve una cadena de String con todos 
     * los datos de los atributos de la clase Barco.
     * @return String con los atributos del Barco.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Matricula del barco: " + matricula + ".\n";
        cadenaADevolver += "La eslora del barco es: " + eslora + " metros.\n";
        cadenaADevolver += "El anno de fabricacion del barco es: " + annoFabricacion + ".\n";
        cadenaADevolver += "Nombre del propietario del barco: " + propietario + ".\n";
        
        return cadenaADevolver;
    }
    
    /**
     * Devuelve la eslora del Barco.
     * @return Double con la eslora del Barco.
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * Metodo abstracto que sera sobrescrito por 
     * las clases hijas de Barco.
     * @return Entero que depende del barco sobre el que se aplique el metodo.
     */
    abstract int getCoeficienteBernua();
    
}





