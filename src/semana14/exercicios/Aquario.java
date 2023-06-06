package semana14.exercicios;
/* Com base no Ex01. da semana 12,
 implemente os métodos get e set para os atributos da classe Aquario.
Deve ser possível alterar os valores dos atributos após o objeto ser criado. 
Os valores não podem ser menores ou igual a 0 (zero). */

public class Aquario {
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

    public double getComprimento(){
        return comprimento;
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setComprimento(double comprimento){
        if (comprimento <= 0.0){
            throw new RuntimeException("Comprimento inválido");
        }
         
        this.comprimento = comprimento;
    }

    public void setLado(double altura){
        if (altura <= 0.0){
            throw new RuntimeException("Altura inválida");
        }
         
        this.altura = altura;
    }

    public void setLargura(double largura){
        if (largura <= 0.0){
            throw new RuntimeException("Largura inválida");
        }
         
        this.largura = largura;
    }

}
