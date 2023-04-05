package semana06.exercicios;

public class Ex02 {
    public static double calcularIMC(double peso, double altura) {
        return peso/(altura*altura);
    }

    public static double informarClassificacao(double IMC) {
        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Você está no peso ideal");
        }
        if (IMC >= 25 && IMC <= 29) {
            System.out.println("Você está com excesso de peso");
        }
        if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Você está com obesidade de classe 1");
        }
        if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Você está com obesidade de classe 2");
        }
        if (IMC >= 40) {
            System.out.println("Você está com obesidade de classe 3");
        }
        return 0;
    }

    public static double calcularPesoIdeal(double altura) {
        return 24.9 * (altura*altura);
    }
    public static double calcularPesoAPerder(double peso, double pesoIdeal) {
        return peso - pesoIdeal;
    }
}
