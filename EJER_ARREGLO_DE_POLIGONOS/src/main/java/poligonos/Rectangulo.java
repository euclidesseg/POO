package poligonos;

public class Rectangulo extends Poligono{
    
  private double lado1, lado2;
  
  //metodo constructor

    public Rectangulo(double lado1, double lado2){
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //metodos getters que me retornen los lados del rectangulo
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + super.toString()+ "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
  @Override
    public double area(){
        return lado1 * lado2;
    }
    
}
