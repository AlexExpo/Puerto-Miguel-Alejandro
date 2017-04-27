/**
 * Clase Persona que representa a los humanos que poseen un Barco.
 * @author Miguel RG.
 * @version 27/04/2017.
 */

public class Persona
{
    
    private String nombre;
    
    private String dni;
    
    /**
     * Constructor de la clase Persona.
     * @param nombre el nombre de la persona.
     * @param dni el dni de la persona.
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Devuelve una cadena de String con todos 
     * los datos de los atributos de la clase Persona.
     * @return String con los datos de la Persona.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "El nombre del cliente es: " + nombre + ".\n";
        cadenaADevolver += "El dni del cliente es: " + dni + ".\n";
        
        return cadenaADevolver;
    }
    
}
