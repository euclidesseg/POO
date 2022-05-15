
package parcial;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int perfil;
        int  r = 1;
        String R = "SI";
        ArrayList<Whatchman> listvigilantes= new ArrayList();
        ArrayList<CleaningStaff> listlimpiadores = new ArrayList();
        ArrayList<Accountant> listcontadores = new ArrayList();
        ArrayList<Admin> listadministradores = new ArrayList(); 
        
       while(R.equalsIgnoreCase("SI")){
            
            System.out.println("BIENVENIDO A LA BASE DE DATOS PERSONA, POR FAVOR ESCOJA UNA OPCION PARA LLENAR");
            System.out.println("\t\nTABLAS DE BASE DE DATOS");
            System.out.print("\t\n1: VIGILANTES ");
            System.out.print("\t\n2: LIMPIADORES");
            System.out.print("\t\n3: CONTADORES ");
            System.out.println("\t\n4: ADMINISTRADORES");
            
            System.out.println("\t\nQUE PERFIL DESEA LLENAR");
            perfil = entrada.nextInt();
            switch(perfil){
                
                case 1: 
                    String nombre;
                    String dni;
                    int edad;
                    String arma;
                    String diaDescanso;
                    
                    Whatchman vigilante;//CREAMOS EL OBJETO SIN INICIALIZARLO
                    
                        entrada.nextLine();
                        System.out.println("INGRESE LOS DATOS PARA LA TABLA VIGILANTE");
                        System.out.println("INGRESE EL NOMBRE DEL VIGILANTE");
                        nombre = entrada.nextLine();
                        System.out.println("INGRESE EL DNI DEL VIGILANTE");
                        dni = entrada.nextLine();
                        System.out.println("INGRESE LA EDAD DEL VIGILANTE");
                        edad = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("INGRESE QUE ARMA DE DOTACION TIENE");
                        arma = entrada.nextLine();
                        System.out.println("INGRESE EL DIA QUE DESCANSA ESTE VIGILANTE");
                        diaDescanso = entrada.nextLine();
                        
                        //inicializacion del objeto creado
                        vigilante = new Whatchman(nombre,dni,edad,arma,diaDescanso);
                        listvigilantes.add(vigilante);//agregamos nuestro objeto a la lista de arreglos
                        
                        System.out.println("LA LISTA DE VIGILANTES ES:");
                        for (int i = 0; i < listvigilantes.size(); i++) {
                             System.out.println(listvigilantes.get(i).getDatos());
                        }
                    break;
                    
                case 2: 
                    CleaningStaff limpiador;//CREAMOS EL OBJETO SIN INICIALIZARLO
                    
                        entrada.nextLine();
                        System.out.println("INGRESE LOS DATOS PARA LA TABLA LIMPIADOR");
                        System.out.println("INGRESE EL NOMBRE DEL LIMPIADOR");
                        nombre = entrada.nextLine();
                        System.out.println("INGRESE EL DNI DEL LIMPIADOR");
                        dni = entrada.nextLine();
                        System.out.println("INGRESE LA EDAD DEL LIMPIADOR");
                        edad = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("INGRESE EL DIA QUE DESCANSA ESTE LIMPIADOR");
                        diaDescanso = entrada.nextLine();
                        
                        //inicializacion del objeto creado
                        limpiador = new CleaningStaff(nombre, dni, edad, diaDescanso);
                        listlimpiadores.add(limpiador);//agregamos nuestro objeto a la lista de arreglos
                        
                        System.out.println("LA LISTA DE LIMPIADORES ES:");
                        for (int i = 0; i < listlimpiadores.size(); i++) {
                             System.out.println(listlimpiadores.get(i).getDatos());
                        }
                    break;
                case 3:
                    String lider;
                    String parqueadero;
                    
                    Accountant contador;//CREAMOS EL OBJETO SIN INICIALIZARLO
                    
                        entrada.nextLine();
                        System.out.println("INGRESE LOS DATOS PARA LA TABLA CONTADOR");
                        System.out.println("INGRESE EL NOMBRE DEL CONTADOR");
                        nombre = entrada.nextLine();
                        System.out.println("INGRESE EL DNI DEL CONTADOR");
                        dni = entrada.nextLine();
                        System.out.println("INGRESE LA EDAD DEL CONTADOR");
                        edad = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("INGRESE EL JEFE DEL CONTADOR");
                        lider = entrada.nextLine();
                        System.out.println("INGRESE EL PARQUEADERO DEL CONTADOR");
                        parqueadero = entrada.nextLine();
                        
                        //inicializacion del objeto creado
                        contador = new Accountant(nombre, dni, edad, lider, parqueadero);
                        listcontadores.add(contador);//agregamos nuestro objeto a la lista de arreglos
                        
                        System.out.println("LA LISTA DE CONTADORES ES:");
                        for (int i = 0; i < listcontadores.size(); i++) {
                             System.out.println(listcontadores.get(i).getDatos());
                        }
                    break;
                case 4:
                    Admin administrador;//CREAMOS EL OBJETO SIN INICIALIZARLO
                    
                        entrada.nextLine();
                        System.out.println("INGRESE LOS DATOS PARA LA TABLA ADMINISTRADOR");
                        System.out.println("INGRESE EL NOMBRE DEL ADMINISTRADOR");
                        nombre = entrada.nextLine();
                        System.out.println("INGRESE EL DNI DEL ADMINISTRADOR");
                        dni = entrada.nextLine();
                        System.out.println("INGRESE LA EDAD DEL ADMINISTRADOR");
                        edad = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("INGRESE EL JEFE DEL ADMINISTRADOR");
                        lider = entrada.nextLine();
                        System.out.println("INGRESE EL PARQUEADERO DEL ADMINISTRADOR");
                        parqueadero = entrada.nextLine();
                        
                        //inicializacion del objeto creado
                        administrador = new Admin(nombre, dni, edad, lider, parqueadero);
                        listadministradores.add(administrador);//agregamos nuestro objeto a la lista de arreglos
                        
                        System.out.println("LA LISTA DE ADMINISTRADORES ES:");
                        for (int i = 0; i < listadministradores.size(); i++) {
                             System.out.println(listadministradores.get(i).getDatos());
                        }
                    break;
                    
            }  
        System.out.println("\nDESEA SEGUIR INGRESANDO DATOS A LA BASE");
        R = entrada.nextLine();
        }
        System.out.println("LOS DATOS REGISTRADOS EN LA BASE DE DATOS FUERON ");
        for (int i = 0; i < listvigilantes.size(); i++) {
            System.out.println(listvigilantes.get(i).getDatos());
        }
        for (int i = 0; i < listlimpiadores.size(); i++) {
            System.out.println(listlimpiadores.get(i).getDatos());
        }
        for (int i = 0; i < listcontadores.size(); i++) {
            System.out.println(listcontadores.get(i).getDatos());
        }
        for (int i = 0; i < listadministradores.size(); i++) {
            System.out.println(listadministradores.get(i).getDatos());
        }
        
        
    }
}
 
