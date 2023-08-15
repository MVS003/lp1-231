package semana17.exercicios;

import java.util.ArrayList;

public class Correntista {
    private int codigo;
    private String nome;
    private ArrayList<Conta> contas;
    
    public Correntista(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        contas = new ArrayList<>();
    }
}
