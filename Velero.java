/**
 * Barco de tipo Velero que ademas de los atributos de un Barco generico tiene mastiles.
 * @author Miguel RG.
 * @Version 27/04/2017.
 */

public class Velero extends Barco
{
    
    private int numeroMastiles;

    /**
     * Constructor de la clase Velero.
     * @param numeroMastiles indica el numero de mastiles que tiene el Velero.
     */
    public Velero(String matricula, double eslora, int annoFabricacion, Persona propietario, int numeroMastiles)
    {
        super(matricula, eslora, annoFabricacion, propietario);
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * Devuelve una cadena de String con todos 
     * los datos de los atributos de la clase Velero.
     * @return String con los datos de el Barco mas los del velero.
     */
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "El numero de mastiles del barco es: " + numeroMastiles + ".\n";
        
        return cadenaADevolver;
    }
    
    /**
     * Devuelve el coeficiente de bernua del Barco
     * que en este caso coincide con el numero 
     * de mastiles del Barco.
     * @return Entero con el coeficiente de bernua de este velero en concreto.
     */
    public int getCoeficienteBernua()
    {
        return numeroMastiles;
    }
    
}


