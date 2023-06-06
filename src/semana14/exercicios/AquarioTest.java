package semana14.exercicios;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    @Test
    public void testaCalcularVolume() {
        Aquario aqua1 = new Aquario(100.0, 50.0, 50.0);

        double volume = aqua1.calcularVolume();
    }

    @Test
    public void testecalcularPotenciaDoTermostato(){
        Aquario aqua1 = new Aquario(100.0, 50.0, 50.0);
        double temperaturaDesejada = 28;
        double temperaturaAmbiente = 16;
    
        double potencia = aqua1.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);
    }

    @Test
    public void testecalcularQuantidadeLitrosFiltro (){
        Aquario aqua1 = new Aquario(50.0);

        double filtragem = aqua1.calcularQuantidadeLitrosFiltro();
    }

    @Test
    public void testaGetComprimento() {
        Aquario aqua1 = new Aquario(100.0, 50.0, 50.0);

        aqua1.getComprimento();
    }

    @Test
    public void testaSetComprimento() {
        Aquario aqua1 = new Aquario(100.0, 50.0, 50.0);

        aqua1.setComprimento(70);
    }

}
