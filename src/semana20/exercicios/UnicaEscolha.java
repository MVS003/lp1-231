package semana20.exercicios;

public class UnicaEscolha extends Questao{
    private String resposta;

    public UnicaEscolha (int numero, String enunciado, String respostas){
        super(numero, enunciado);
        this.resposta = resposta;
    }

    @Override 
        public boolean validarResposta(String resposta) 
    { 
        return resposta.equalsIgnoreCase(resposta); 
    }
}
