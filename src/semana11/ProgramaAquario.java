package semana11;

public class ProgramaAquario {
    public static void main(String[] args) {
        Aquario aqua1 = new Aquario();
        aqua1.comprimento= 50.0;
        aqua1.altura= 50.0;
        aqua1.largura= 50.0;

        double volume = aqua1.calcularVolume();

        System.out.println(volume);
    }
}
