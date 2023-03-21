package semana05.exercicios;

import java.util.Scanner;

public class Ex02 {
    /* Utilizando as diretrizes de Índice de Massa Corporal (IMC) da Organização Mundial de Saúde (OMS), crie uma calculadora em Java que solicita ao usuário seu peso (Kg) e sua altura (m) e apresenta em qual classificação o indivíduo se encaixa. Além disso, o programa deve apresentar quanto o indivíduo precisa perder ou ganhar de peso para chegar no peso normal (imc = 24,9).

IMC = peso / altura * altura

Classificação
----------------------------------
IMC           Classificação
-----------------------------------
< 18,5         Baixo peso
18,5 a 24,9     Peso normal
25,0 a 29,9     Excesso de peso
30,0 a 34,9     Obesidade de Classe 1
35,0 a 39,9     Obesidade de Classe 2
>= 40,00      Obesidade de Classe 3 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso ");
        double peso = sc.nextDouble();

        System.out.println("Digite a sua altura ");
        double altura = sc.nextDouble();

        double IMC = peso/ (altura*altura);

        System.out.println("Seu IMC é: " + IMC);

        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Você está no peso ideal");
        }
        if (IMC >= 25 && IMC <= 29) {
            System.out.println("Você está com excesso de peso");
        }
        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso");
        }

        double pesoIdeal = 24.9 * (altura * altura);
        double pesoAPerder = peso - pesoIdeal;

        System.out.println("Você precisa perder " + pesoAPerder + "Kg");
        

        sc.close();
    }
}
