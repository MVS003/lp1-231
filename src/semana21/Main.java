package semana21;

//Interface = contrato
//conjunto dde métodos (somente assinatura, sem corpo)
//classe concreta que implementa a interface

public class Main {
    public static void main(String[] args) {
        System.out.println("Main...");
        
        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);
        Retangulo r1 = new Retangulo(10, 5);

        tela.addFigura(q1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());
    }
}
