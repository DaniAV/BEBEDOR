
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    //Atributos de la clase Cubata
    
    private String nombre;
    private int cantidadDeAlcohol;

    /**
     * Constructor de los objetos de la clase Cubata
     */
    public Cubata(String nombreCubata, int CantidadAlcohol)
    {
        // initialise instance variables
        nombre = nombreCubata;
        cantidadDeAlcohol = CantidadAlcohol;
    }
    
    /**
     * Metodo que devuelve la cantidad de alcohol
     */
    
    public int getAlcohol()
    {
        return cantidadDeAlcohol;
    }

}
