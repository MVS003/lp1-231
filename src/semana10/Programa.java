package semana10;

public class Programa {
    public static void main(String[] args) {
        // calcular a area e o perimetro retangulo
        // area = base * altura
        // perimetro = 2 * (base + altura)

        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;

        double areaRet1 = baseRet1 * alturaRet1;
        double perimetroRet1 = 2 * (baseRet1 + alturaRet1);

        System.out.println(areaRet1);
        System.out.println(perimetroRet1);


        double baseRet2 = 30.0;
        double alturaRet2 = 10.0;

        double areaRet2 = baseRet2 * alturaRet2;
        double perimetroRet2 = 2 * (baseRet2 + alturaRet2);

        System.out.println(areaRet2);
        System.out.println(perimetroRet2);


        //tipo nomevariavel = valor
        String palavra = "abc";

        //objeto (instancia) da classe retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base=10.0;
        ret1.altura=5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base=30.0;
        ret2.altura=30.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}
