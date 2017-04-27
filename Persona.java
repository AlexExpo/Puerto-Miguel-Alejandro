

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
