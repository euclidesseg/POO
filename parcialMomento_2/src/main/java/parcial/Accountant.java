
package parcial;


public class Accountant extends Persona{
    private String lider;
    private String parqueadero;
    
    public Accountant(String nombre, String dni, int edad, String lider, String parqueadero){
        super(nombre, dni, edad);
        this.lider = lider;
        this.parqueadero = parqueadero;
    }
     public String getDatos(){
        return(" Nombre: " + nombre +
               "\n Identificacion: " + dni +
               "\n Edad: " + edad +
               "\n Lider: " + lider +
               "\n Paerqueadero: "+ parqueadero +
               "\n-----CONTADOR----"+
               "\n"
               );
    }          
}
