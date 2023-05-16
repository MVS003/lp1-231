package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    public void testaCalcularIMC() {
        Pessoa p1 = new Pessoa();
        p1.altura = 1.72;
        p1.peso = 70.3;

        double imc = p1.calcularIMC();

         assertEquals (23.762844780962684, imc);
    }

    @Test
    public void testaGetFaixa() {
        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        String faixa = p1.getFaixa();
    }

    @Test
    public void testaGetSituacao() {
        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        String situacao = p1.getSituacao();
    }
}
