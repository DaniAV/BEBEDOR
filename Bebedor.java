
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    
    //Aqui se almacenara el nivel de alcohol en sangre.
    private int NivelDeAlcoholEnSangre;
    // Aqui se almacena el nombre que le damos a los objetos de la clase bebedor
    private String nombre;
    //Aqui se almacena el numero de copas que ha bebido un objeto de la clase bebedor
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
        CopasBebidas = 0;
        preguntaMasLarga = null;
        numeroDeCaracteres = 0;

    }

    /**
     * Metodo que simula que el bebedor bebe una copa 
     */
    public void BeberCopa(Cubata nombre)
    {

        this.NivelDeAlcoholEnSangre = NivelDeAlcoholEnSangre + nombre.getAlcohol(); //nombre.getAlcohol invoca a un metodo llamado getAlcohol de la clase 
                                                                                    //cubata dependiendo del nombre
        if (NivelDeAlcoholEnSangre >= 10)
        {
            //No se puede beber mas
            System.out.println (" No puedo beber mas, estoy muy borracho");
            NivelDeAlcoholEnSangre = 10;
        }
        else
        {

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
        preguntaMasLarga = tipoPregunta; // almacena en el atributo preguntaMasLarga el String metido como parametro en tipoDePregunta
        preguntaMasLarga.length(); //El metodo length calcula el número de caracteres que contiene preguntaMasLarga
        numeroDeCaracteres =  preguntaMasLarga.length(); //almacena en numeroDeCaracteres el resultado del metodo length invocado sobre preguntaMasLarga
        if( numeroDeCaracteres%2 == 0) // Si el numeroDeCaracteres almacenado en divisible entre 2 (es par) entonces...
        {
            System.out.println("SI");
        }
        else if(NivelDeAlcoholEnSangre > 10 || preguntaMasLarga.contains(nombre))//Si el nivel de alcohol supera el 10 y la preguntaMasLarga contiene el atributo nombre entonces...
        {
            System.out.println ("¡¡¡ " + tipoPregunta.toUpperCase() +" !!!");
        }
        else // sino suceda nada de los dos casos anteriores entonces...
        {
            System.out.println("NO");
        }
    }
}

    
