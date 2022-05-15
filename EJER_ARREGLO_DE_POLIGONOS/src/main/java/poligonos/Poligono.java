/*
    HACER UN PROGRAMA POARA CALCULAR EL AREA DE POLIGONOS(TRIANGULO RECTANGULOS)
    EL PROGRAMA DEBE SER CAPAZ DE ALMACENEAR EN UN ARREGLO N TRIANGULOS Y RECTANGULOS
    Y  AL FINALIZAR MOSTRAR EL AREA Y LOS DATOS DE CADA UNO
 */
package poligonos;


public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

        //este metodo reempolacza al metodo mostrar datos 
    @Override
    public String toString(){
        return " \n Numero Lados" + numeroLados;
    }
    
    public abstract double area();
}
