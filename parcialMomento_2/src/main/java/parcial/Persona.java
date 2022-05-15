
package parcial;

public class Persona {
    
    //atributos 
    /*ponemos los metodos en protected ya que son los usados en la herencia 
      y porque con private me pide que ponga los atributos como constantes
    */
    protected String nombre;//final indica que nombre sera una constante
    protected String dni;
    protected int edad;
    
    //metodo constructor 
    public Persona(String nombre, String dni, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    //metodos getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }
}
