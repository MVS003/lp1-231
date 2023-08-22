package semana20.exercicios;

public class UnicaEscolha extends Questão{
    private String resposta;

    public UnicaEscolha (int numero, String enunciado, String respostas){
        super(numero, enunciado);
        this.resposta = resposta;
    }
}
