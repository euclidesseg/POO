/*
    HACER UN PROGRAMA POARA CALCULAR EL AREA DE POLIGONOS(TRIANGULO RECTANGULOS)
    EL PROGRAMA DEBE SER CAPAZ DE ALMACENEAR EN UN ARREGLO N TRIANGULOS Y RECTANGULOS
    Y  AL FINALIZAR MOSTRAR EL AREA Y LOS DATOS DE CADA UNO
 */
package poligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligonos = new ArrayList();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String args[]){
        llenarPoligonos();
        mostrarResultados();
    }
    
    //metodo para llenar un poligono dependiendo de si es triangulo o es rectangulo
    public static void llenarPoligonos(){
        int opcion;
        char respuesta;
        do{
            do{
                System.out.println("DIGITE QUE POLIGONO DESEA LLENAR");
                System.out.println("1: TRIANGULO");
                System.out.println("2: RECTANGULO");
                System.out.println("OPCION");
                opcion = entrada.nextInt();
            }while(opcion < 1 || opcion > 2); 
            /* si el usuario ingrese un numero diferente de 1 y de 2 se le volvera a 
               a pedir que ingrese una opcion par el llenado del poligono*/
            
            //este switch procede de acuerdo a la opcion que escoja e usuario
            switch(opcion){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }
            
            System.out.println("DESEA SEGUIR INGRESANDO DATOS");
            respuesta = entrada.next().charAt(0);
        }while(respuesta == 's' || respuesta == 'S');
        
        
    }
    public static void llenarTriangulo(){
        double lado1,lado2, lado3;
        
        System.out.println("INGRESE EL LADO1");
        lado1 = entrada.nextDouble();
        System.out.println("INGRESE EL LADO2");
        lado2 = entrada.nextDouble();
        System.out.println("INGRESE EL LADO3");
        lado3 = entrada.nextDouble();
        
        //creamos un objeto de la clase otriangulo ya que tenemos los datos para crearlo
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligonos.add(triangulo);//agregamos el objeto que creamos al arreglo del tipo de poligonos
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        
        System.out.println("INGRESE EL LADO1");
        lado1 = entrada.nextDouble();
        System.out.println("INGRESE EL LADO2");
        lado2 = entrada.nextDouble();
        
        
        //creamos un objeto de la clase rectangulo ya que tenemos los datos para crearlo
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligonos.add(rectangulo);//agregamos el objeto que creamos al arreglo del tipo de poligonos
    }
    
    public static void mostrarResultados(){
        for (int i = 0; i < poligonos.size();i++) {
            System.out.println(poligonos.get(i).toString());
            System.out.println("Area" + poligonos.get(i).area());
            
            /* el metodo poligonos.size recorre el arreglo de poligonos
               el metodo poligonos.get(i) trae la pocicion actual del arreglo y 
               muestra sus datos 
            
               si el usuario desidio llenar un arreglo con un objeto triangulo 
               se tomara el metodo toString de la clase triangulo
               e imprimiara sus datos */
        }
    }
}
