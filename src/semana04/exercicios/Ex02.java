package semana04.exercicios;

import java.util.Scanner;

public class Ex02 {
    //Escreva um programa em Java que solicita ao usuário três números e apresenta a média aritmética dos números informados.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        double numero1 = sc.nextDouble();

        System.out.println("Entre com o segundo número");
        double numero2 = sc.nextDouble();

        System.out.println("Entre com o terceiro número");
        double numero3 = sc.nextDouble();

        double mediaAritimetica = (numero1 + numero2 + numero3)/3;

        System.out.println("A média aritimética dos números é " + mediaAritimetica);

        sc.close();
    }
}
