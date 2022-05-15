
package parcial;


public class Admin extends Persona {
    private String lider;
    private String parqueadero;
    
    public Admin(String nombre, String dni, int edad, String lider, String parqueadero){
        super(nombre, dni, edad);
        this.lider = lider;
        this.parqueadero = parqueadero;
    }
     public String getDatos(){
        return(" Nombre: " + nombre +
               "\n Identificacion: " + dni +
               "\n Edad: " + edad +
               "\n Lider: " +
               "\n Paerqueadero: "+ parqueadero +
               "\n----ADMINISTRADOR------"+
               "\n");
               
    }          
}
