package semana14;

public class Programa {
  public static void main(String[] args) {
    Quadrado quadrado = new Quadrado(10.0);
    //quadrado.lado = 0.0;
    
    quadrado.setLado(20);

    System.out.println(quadrado.getLado());
    
    System.out.println(quadrado.calcularArea());

    System.out.println(quadrado.calcularPerimetro());

    Retangulo r1 = new Retangulo(10.0, 5.0);
    Retangulo r2 = new Retangulo(20.0, 30.0);
    Retangulo r3 = new Retangulo(15.0);

    System.out.println(r3.base);
    System.out.println(r3.altura);
  }  
}
