package semana07.revisao;

public class Ex03 {
    /*Escreva um método estático em Java que recebe três parâmetros int e devolve o maior valor; */

    public static int DevolverMaiorValor (int parametro1, int parametro2, int parametro3, int maior){
        if (parametro1 > parametro2 && parametro1 > parametro3){
            maior = parametro1;
        }
        if (parametro2 > parametro1 && parametro2 > parametro3){
            maior = parametro2;
        }
        if (parametro3 > parametro1 && parametro3 > parametro2){
            maior = parametro3;
        }

        return maior;
    }
}
