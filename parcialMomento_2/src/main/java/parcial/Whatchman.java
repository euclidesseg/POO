
package parcial;

//vigilante
public class Whatchman extends Persona{
    
    //atributos
    private String arma;
    private String diaDescanso;
    public Whatchman(String nombre, String dni, int edad, String arma, String diaDescanso){
        super(nombre,dni,edad);
        this.arma = arma;
        this.diaDescanso = diaDescanso;
    }

    
    public String getDatos(){
        return(" Nombre: " + nombre +
               "\n Identificacion: " + dni +
               "\n Edad: " + edad +
               "\n Arma: " + arma +
               "\n Dia de Descanso: " + diaDescanso +
               "\n------VIGILANYE------"+
               "\n"
               );
    }
}
