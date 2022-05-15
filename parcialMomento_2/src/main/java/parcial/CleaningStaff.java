
package parcial;


public class CleaningStaff extends Persona {
    
    //atributos
    protected String diaDescanso;
    
    public CleaningStaff(String nombre, String dni, int edad, String diaDescanso){
        super(nombre,dni,edad);
        this.diaDescanso = diaDescanso;
        
    }
    public String getDatos(){
        return(" Nombre: " + nombre +
               "\n Identificacion: " + dni +
               "\n Edad: " + edad +
               "\n Dia de Descanso: " + diaDescanso +
                "\n------LIMPIADOR------"+
               "\n"
               );
    }
}
