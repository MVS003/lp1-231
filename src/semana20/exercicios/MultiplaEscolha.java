package semana20.exercicios;

import java.util.ArrayList;

public class MultiplaEscolha extends Questao{
    private ArrayList<MultiplaEscolha> respostas;

    public MultiplaEscolha(int numero, String enunciado, ArrayList respostas) {
        super(numero, enunciado);
        this.respostas = respostas;
    }

    @Override 
        
        public boolean validarResposta(String resposta) 
        { 
            return resposta.contains(resposta); 
        } 

    
}