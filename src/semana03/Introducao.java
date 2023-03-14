package semana03;

import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        //Comentario de uma linha
        /*
        *
        *
        */
        
        // Tipos primitivos
        // Inteiros
        //byte, short, int, long

        // Ponto Flutuante
        float nota1 = 10.34343f; //4 bytes
        double nota2 = 10.434343; //8 bytes

        //char
        char letra = 'A';
        
        //boolean
        boolean ligado = true;
        boolean teste = false;

        // String
        String nome = "João da Silva";

        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        // variaveis e constantes
        int idade = 20;
        int idade2;
        idade2 = 30;

        //Java 10 - inferência de tipo com var
        var idade3 = 15;
        var nome2 = "Maria";

        // Constante - keyword final
        final double TESTE = 20.2;
        final double PI = 3.14;

        // Entrada e saída de dados

        // Entrada - Classe Scanner
        // Saída - System.out

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu nome");
        String nomeInformado = sc.nextLine();

        System.out.println("Entre com a sua idade");
        int idadeInformada = sc.nextInt();

        System.out.println(nomeInformado + " " + idadeInformada);

        sc.close();

        
    }
}
