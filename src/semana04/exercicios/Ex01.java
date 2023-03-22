package semana04.exercicios;

import java.util.Scanner;

public class Ex01 {
     //Escreva um programa em Java que solicita ao usuário um número inteiro e apresenta seu antecessor e sucessor.

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = sc.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor do número é " + antecessor);
        System.out.println("O sucessor do número é " + sucessor);
        
        sc.close();  
    }
}
