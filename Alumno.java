import java.util.Random;
import java.util.ArrayList;
/**
 * clase para 
 * 
 * @author (marco) 
 * @version (1-13/03/2015)
 */
public class Alumno
{
  // instance variables - replace the example below with your own
    private int nota[];
    private int edad;
    private int aula;
    private String nombre;
    public int media;
    public int numero_asignaturas;
    //creamos una constante final , no podemos cambiar el valor de esa constante
   // private final int NOTA_MINIMA;
    public  static final int NOTA_MINIMA=5;//variable de clase que almacena cnstante
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre,int edad)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.nota=new int[0];
    }
 
    public void setAula(int aula)
    {
        if(aula < 0)
        {
            this.aula=1;
        }
        else
        {
            this.aula=aula;
        }
    }
    
   
    
    /**
     * cuantas notas introducimos
     */
    public void addNota(int nota)
    {
        
        int[] newnotas=new int[this.nota.length +1];
        
        if(this.nota.length == 0)
        {
            newnotas[(this.nota.length) -1] = nota;
        }
        else
        {
            newnotas[this.nota.length] = nota;
        }
       
        this.nota=newnotas;
    }
    
    
}
