
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    
    private String nombre;
    
    private String dni;
    
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "El nombre del cliente es: " + nombre + ".\n";
        cadenaADevolver += "El dni del cliente es: " + dni + ".\n";
        
        return cadenaADevolver;
    }
    
}
