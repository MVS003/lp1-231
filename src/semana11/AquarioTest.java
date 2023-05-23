package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    @Test
    public void testaCalcularVolume() {
        Aquario aqua1 = new Aquario();
        aqua1.comprimento= 100.0;
        aqua1.altura= 50.0;
        aqua1.largura= 50.0;

        double volume = aqua1.calcularVolume();

        assertEquals(250.0, volume);
    }

    @Test
    public void testecalcularPotenciaDoTermostato(){
        Aquario aqua1 = new Aquario();
        double temperaturaDesejada = 28;
        double temperaturaAmbiente = 16;
        aqua1.comprimento = 100.0;
        aqua1.largura = 50.0;
        aqua1.altura = 50.0;

        double potencia = aqua1.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);

        assertEquals(150.0, potencia);  
    }

    @Test
    public void testecalcularQuantidadeLitrosFiltro (){
        Aquario aqua1 = new Aquario();
        aqua1.comprimento= 100.0;
        aqua1.altura= 50.0;
        aqua1.largura= 50.0;

        double filtragem = aqua1.calcularQuantidadeLitrosFiltro();

        assertEquals(500.0, filtragem);
    }
}
