package semana12.exercicios;

public class Aquario {
    /*Com base no Ex01. da semana 11, implemente dois construtores para classe Aquario.
     O primeiro deve receber comprimento, altura e a largura e o segundo deve receber um único valor 
     e atribuir esse único valor aos três atributos.
    Complemente os testes de unidade já existentes da classe com testes dos construtores. */
    public double comprimento;
    public double altura;
    public double largura;

    public Aquario(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double valor) {
        this(valor, valor, valor);
    }

    public double calcularVolume (){
        return (comprimento * altura * largura)/1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
       return calcularVolume() * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }
    
    public double calcularQuantidadeLitrosFiltro(){
        double filtragem = calcularVolume() * 2;
        return filtragem;
    } 
}
