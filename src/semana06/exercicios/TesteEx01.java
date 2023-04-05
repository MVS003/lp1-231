package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteEx01 {

    @Test
    public void calculaVolume(){
        double comprimento = 50;
        double altura = 50; 
        double largura = 90;

        double volume = Ex01.calcularVolume(comprimento, altura, largura);

        assertEquals(225, volume);
    }

    @Test
    public void calculaPotencia(){
        double volume = 225;
        double temperaturaDesejada = 26; 
        double temperaturaAmbiente = 20;

        double potencia = Ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente );

        assertEquals(67.5, potencia);
    }

    @Test
    public void calculaFiltragem(){
        double volume = 225;
        
        double filtragem = Ex01.calcularFiltragem(volume );

        assertEquals(450, filtragem);
    }

}
