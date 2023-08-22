package semana20.exercicios;

import java.util.ArrayList;

public class MultiplaEscolha extends Questão{
    private ArrayList<MultiplaEscolha> respostas;

    public MultiplaEscolha(int numero, String enunciado, ArrayList respostas) {
        super(numero, enunciado);
        this.respostas = respostas;
    }
    
}
