package ejemplo;

public class Ejemplo {

    public static void main(String[] args) {
        System.out.println(Circulo.PI);
        Circulo C1 = new Circulo(12);
        System.out.println(C1.Area());
        C1.setX(10);
        C1.setY(2);
    }
    
}
