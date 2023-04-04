package semana07.revisao;

public class Ex04 {
    /*Escreva um método estático em Java que recebe três parâmetros int e devolve o menor valor; */

    public static int DevolverMenorValor (int parametro1, int parametro2, int parametro3, int menor){
        if (parametro1 < parametro2 && parametro1 < parametro3){
            menor = parametro1;
        }
        if (parametro2 < parametro1 && parametro2 < parametro3){
            menor = parametro2;
        }
        if (parametro3 < parametro1 && parametro3 < parametro2){
            menor = parametro3;
        }

        return menor;
    }
}
