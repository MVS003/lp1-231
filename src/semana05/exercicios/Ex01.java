package semana05.exercicios;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ex01 {
    public static void main(String[] args) {
        /* Crie um programa em Java que recebe como entrada o comprimento, altura e a largura de um aquário e calcule as seguintes informações.

    O volume do aquário em litros;
    A potência do termostato necessária para manter a temperatura adequada dentro do aquário;
    A quantidade em litros de filtragem por hora necessária para manter a qualidade da água.

    Volume é dado por (comprimento * altura * largura) / 1000
    A potência do termostato depende do tamanho do aquário e da temperatura ambiente. Para o cálculo utilizar a fórmula: potencia = volume * 0,05 * (temperatura desejada - temperatura ambiente)
    A quantidade de filtragem por hora deve ser no mínimo 2 a 3 vezes o volume do aquário. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do aquário ");
        double comprimento = sc.nextDouble();

        System.out.println("Digite a altura do aquário ");
        double altura = sc.nextDouble();

        System.out.println("Digite a largura do aquário ");
        double largura = sc.nextDouble();

        double volume = (comprimento * altura * largura)/1000;

        System.out.println("O volume do aquário é de " + volume + "L");

        System.out.println("Digite a temperatura do ambiente do aquário ");
        double temperaturaAmbiente = sc.nextDouble();

        System.out.println("Digite a temperatura desejada para o aquário ");
        double temperaturaDesejada = sc.nextDouble();

        double potencia = volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente);

        System.out.println("A potência do termostato necessária para manter a temperatura adequada dentro do aquário é " + potencia);

        double filtragem1 = volume * 2;
        double filtragem2 = volume * 3; 

        System.out.println("A quantidade em litros de filtragem por hora necessária para manter a qualidade da água é entre " + filtragem1 + " e " + filtragem2 );
        
        sc.close();
    }
}
