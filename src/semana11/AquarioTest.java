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

        assertEquals(250.00, volume);
    }
}
