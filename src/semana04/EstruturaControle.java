package semana04;

import javax.sound.sampled.SourceDataLine;

public class EstruturaControle {
    public static void main(String[] args) {
        // if

        int idade = 20;
        final int MAIORIDADE = 18;

        if (idade >= MAIORIDADE) {
            System.out.println("Maior de idade");
        }
        
        //if/else
        boolean ligado = true;

        if (ligado) {
            System.out.println("Sensor ligado!");
        } else {
            System.out.println("Sensor desligado");
        }

        //switch
        //char, byte, short, int
        //String
        //enum

        int x = 3;
        switch (x) {
            case 1 :
                System.out.println("Número 1");
                break;
            case 2 :
                System.out.println("Número 2");
                break;
            case 3 :
                System.out.println("Número 3");
                break;
            default:
                System.out.println("Número não identificado");
                break;
        }
        //while, do while, for, foreach

        int contador = 0;
        while (contador < 3) {
            System.out.println("Ligado!");
            contador++;
        }

        contador = 0;
        do {
            System.out.println("Ligado!");
            contador++;
        } while (contador < 3);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ligado! fori");
        }

        //Arrays
        //vários dados em uma mesma variavél

        // 3 notas
        double n1 = 10.0;
        double n2 = 5.5;
        double n3 = 7.4;
        
        double[] notas = new double[3];
        notas[0] = 10.0;
        notas[1] = 5.5;
        notas[2] = 7.4;

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);

        //foreach

        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}
