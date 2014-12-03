
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // atributos de la clase bebedor
    private int NivelDeAlcoholEnSangre;
    private String nombre;
    private int CopasBebidas;
    //Almacena la longitud de la pregunta
    private String preguntaMasLarga;
    //Almacena la cantidad de caracteres de la pregunta
    private int numeroDeCaracteres;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombre)
    {
        //Inicializamos los atributos de la clase bebedor
        this.nombre = nombre;
        NivelDeAlcoholEnSangre = 0;

    }

    /**
     * Metodo que simula que el bebedor bebe una copa 
     */
    public void BeberCopa(Cubata nombre)
    {

        this.NivelDeAlcoholEnSangre = NivelDeAlcoholEnSangre + nombre.getAlcohol();
        if (NivelDeAlcoholEnSangre > 10)
        {
            //No se puede beber mas
            System.out.println (" No puedo beber mas, estoy muy borracho");
            NivelDeAlcoholEnSangre = 10;
        }

    }

    /**
     * Metodo que comprueba el alcohol en sangre del bebedor
     */

    public int NivelDeAlcohol()
    {
        return NivelDeAlcoholEnSangre;
    }

    /**
     * Metodo para preguntarle al bebedor si ha pasado el limite de copas que
     * puede beber
     */
    public void Pregunta(String tipoPregunta)
    {
        preguntaMasLarga = tipoPregunta;
        preguntaMasLarga.length();
        numeroDeCaracteres =  preguntaMasLarga.length();
        if( numeroDeCaracteres%2 == 0)
        {
            System.out.println("SI");
        }
        else if(NivelDeAlcoholEnSangre > 10 || preguntaMasLarga.contains(nombre))
        {
            System.out.println ("¡¡¡! " + tipoPregunta.toUpperCase() +" !!!");
        }
        else
        {
            System.out.println("NO");
        }
    }
}

    
