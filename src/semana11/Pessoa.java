package semana11;

/*Com base no Ex02. da semana 5 e 6 e código a seguir implemente a classe que atendem os requisitos:

// considere esse código dentro do método main da class Programa

Pessoa p1 = new Pessoa();
p1.altura = 172;
p1.peso = 70.3;

double imc = p1.calcularImc();
String faixa = p1.getFaixa();
String situacao = p1.getSituacao(); // "GANHAR" = ganhar peso, "PERDER" = perder peso, "NORMAL" = peso ok

Testes todos os métodos da classe Pessoa utilizando testes de unidade */

public class Pessoa {
    public double altura;
    public double peso;
    
    public double calcularIMC() {
        return peso/(altura*altura);
    }

    public String getFaixa() {
        if (calcularIMC() < 18.5) {
            return "Você está abaixo do peso";
        }
        if (calcularIMC() >= 18.5 && calcularIMC() <= 24.9) {
            return "Você está no peso ideal";
        }
        if (calcularIMC() >= 25 && calcularIMC() <= 29) {
            return "Você está com excesso de peso";
        }
        if (calcularIMC() >= 30 && calcularIMC() <= 34.9) {
            return "Você está com obesidade de classe 1";
        }
        if (calcularIMC() >= 35 && calcularIMC() <= 39.9) {
            return "Você está com obesidade de classe 2";
        }
        if (calcularIMC() >= 40) {
            return"Você está com obesidade de classe 3";
        }
        return "erro";
    }

    public double pesoIdeal() {
        return 24.9 * (altura*altura);
    }
    public String getSituacao() {
        if (pesoIdeal()>calcularIMC()) {
            return "Ganhar peso";
        }
        if (pesoIdeal()==calcularIMC()) {
            return "Peso ok";
        }
        if (pesoIdeal()<calcularIMC()) {
            return "Perder peso";
        }
        return "erro";
    }
    
}
