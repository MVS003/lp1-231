package semana20.exercicios;

public abstract class Questao {
    private int numero;
    private String enunciado;

    public Questao (int numero, String enunciado) {
        this.numero = numero;
        this.enunciado = enunciado;
    }

     public boolean validarResposta(String resposta)
    { 
        return false;
    } 
}
