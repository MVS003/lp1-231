package semana11;

/*Com base no Ex01. da semana 5 e 6 crie uma classe Aquario que possui os atributos comprimento, altura e largura
e os métodos calcularVolume, calcularPotenciaDoTermostato e calcularQuantidadeLitrosFiltro.
Testes todos os métodos da classe Aquario utilizando testes de unidade */

public class Aquario {

    public double comprimento;
    public double altura;
    public double largura;

    public double calcularVolume (){
        return (comprimento * altura * largura)/1000;
    }

    /*public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
       return calcularVolume() * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }
    
    public double calcularQuantidadeLitrosFiltro(){
        double filtragem = calcularVolume() * 2;
        return filtragem;
    } */
}
