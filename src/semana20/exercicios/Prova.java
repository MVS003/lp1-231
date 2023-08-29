package semana20.exercicios;

import java.util.ArrayList;

public class Prova{
    private double pontuacao;
    private ArrayList<Prova> questoes;

    public Prova() {
        pontuacao = 0.0;
        questoes = new ArrayList<>();
    }
    public void adicionarQuestao (Prova questao) {
        questoes.add(questao);
        pontuacao ++;
    }
} 
