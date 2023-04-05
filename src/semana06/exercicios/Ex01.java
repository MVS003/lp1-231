package semana06.exercicios;

public class Ex01 {

    public static double calcularVolume (double comprimento, double altura, double largura){
        return (comprimento * altura * largura)/1000;
    } 

    public static double calcularPotencia(double volume, double temperaturaDesejada, double temperaturaAmbiente) {
       return volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }
    
    public static double calcularFiltragem(double volume){
        double filtragem = volume * 2;
        return filtragem;
    }
}
