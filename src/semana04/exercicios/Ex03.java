package semana04.exercicios;

import java.util.Scanner;

public class Ex03 {
    /*Crie um programa em Java que recebe como entrada o valor de uma compra e apresenta como saída o valor final com desconto e o desconto aplicado com base nas seguintes regras:

Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
Compras iguais ou superiores a R$ 500,00 - 15% de desconto */
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da compra");
    float valorInicial = sc.nextFloat();

    if (valorInicial >= 0.01 && valorInicial <= 9.99) {
        System.out.println("O valor final da compra é " + valorInicial);
    }
        if (valorInicial >= 10 && valorInicial <= 99.99) {
            double desconto = valorInicial * 0.05;
            double valorFinal = valorInicial - desconto;
            System.out.println("O valor final da compra é " + valorFinal);
        }
        if (valorInicial >= 100 && valorInicial <= 499.99) {
            double desconto = valorInicial * 0.1;
            double valorFinal = valorInicial - desconto;
            System.out.println("O valor final da compra é " + valorFinal);
        }
        if (valorInicial >= 500) {
            double desconto = valorInicial * 0.125;
            double valorFinal = valorInicial - desconto;
            System.out.println("O valor final da compra é " + valorFinal);
        }
    else {
        System.out.println("Compra não pode possuir valor negativo");
    }

    sc.close();
    }
}
