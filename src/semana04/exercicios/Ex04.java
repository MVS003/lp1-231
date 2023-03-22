package semana04.exercicios;

import java.util.Scanner;

public class Ex04 {
    /*O código identificador de funcionários de uma empresa contém 7 caracteres,
    inicia com a sequência de caracteres BR, em seguida apresenta um número inteiro
    entre 0001 e 9999 e finaliza com o caractere X. 
    Crie um programa em Java que solicita ao usuário um identificador 
    e apresenta se o que foi informado é um valor válido ou inválido. */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código identificador");
        String codigo = sc.nextLine();
        
        if (codigo.matches("BR\\d{4}X")) {
            System.out.println("O código é válido.");
        } else {
            System.out.println("O código não é válido.");
        }
        
        sc.close();
    }
}
