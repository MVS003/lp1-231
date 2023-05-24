package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void testeSacar() {
        Conta c1 = new Conta(1, "Maria João");
        c1.saldo = 400.0;

        double novoSaldo = c1.sacar(20.0);

        assertEquals(380.0, novoSaldo);
    }

    @Test
    public void testeDepositar() {
        Conta c1 = new Conta(1, "Maria");
        c1.saldo = 400.0;
        
        double novoSaldo = c1.depositar(100.0);

        assertEquals(500.0, novoSaldo);
    }

    @Test
    public void testeTransferir() {
        Conta c1 = new Conta(1, "Maria");
        c1.saldo = 400.0;
        Conta c2 = new Conta(1, "Luan");
        c2.saldo = 250.0;

        double novoSaldo = c1.transferir(50.0, c2);

        assertEquals(350.0, novoSaldo);
    }
}
