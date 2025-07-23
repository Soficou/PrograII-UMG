package ejemplo;

public class Circulo extends Figura { //extends Figura es un metodo de herencia
    
    private double radio;
    public static double PI = 3.1416;
    
    public Circulo (double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double Area(){
        return PI*(radio * radio); 
    }
    
}
