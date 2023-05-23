package semana12.exercicios;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    public void testecalcularIMC() {
        Pessoa p1 = new Pessoa(1.70, 65.0);

        double IMC = p1.calcularIMC();
    }

    @Test
    public void testegetFaixa(){
        Pessoa p1 = new Pessoa(1.70, 65.0);
    
        String faixa = p1.getFaixa();
    }
    
    @Test
    public void testepesoIdeal(){
        Pessoa p1 = new Pessoa(1.70, 65.0);
    
        double peso = p1.pesoIdeal();
    }

    @Test
    public void testegetSituacao(){
        Pessoa p1 = new Pessoa(1.70, 65.0);
    
        String situacao = p1.getSituacao();
    }

}
