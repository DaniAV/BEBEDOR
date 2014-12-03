
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // instance variables - replace the example below with your own
    private int NivelDeAlcoholEnSangre;
    private String nombre;
    private int CopasBebidas;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
        NivelDeAlcoholEnSangre = 0;
        CopasBebidas = 0;
    }

    /**
     * Metodo que simula que el bebedor bebe una copa 
     */
    public void BeberCopa(Cubata nombre)
    {
        CopasBebidas = CopasBebidas + 1;
        this.NivelDeAlcoholEnSangre = NivelDeAlcoholEnSangre + nombre.getAlcohol();
       
    }
    
    /**
     * Metodo que comprueba el alcohol en sangre del bebedor
     */
    
    public int NivelDeAlcohol()
    {
        return NivelDeAlcoholEnSangre;
    }
}
        
        
    
  
