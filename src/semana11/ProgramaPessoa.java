package semana11;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.altura = 1.72;
        p1.peso = 70.3;

        double imc = p1.calcularIMC();
        String faixa = p1.getFaixa();
        String situacao = p1.getSituacao();

        System.out.println(imc);
        System.out.println(faixa);
        System.out.println(situacao);
    }
}
