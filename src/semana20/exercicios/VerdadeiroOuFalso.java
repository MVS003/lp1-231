package semana20.exercicios;

public class VerdadeiroOuFalso extends Questao {
    private String resposta;

    public VerdadeiroOuFalso (int numero, String enunciado, String respostas){
        super(numero, enunciado);
        this.resposta = resposta;
    }

    
    @Override 
    public boolean validarResposta(String resposta) { 
        return resposta.equalsIgnoreCase("V") == resposta; 
    } 

}
