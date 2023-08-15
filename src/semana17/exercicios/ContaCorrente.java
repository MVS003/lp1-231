package semana17.exercicios;

import java.time.LocalDate;

import javax.management.RuntimeErrorException;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, Correntista correntista, double limite) {
        super(numero, dataAbertura, correntista);
        this.limite = limite;
    }

    public void sacar(double valor) {
        if(valor > limite) {
            throw new RuntimeException("Saque fora do limite");
        }

        super.sacar(valor);
    }

    @Override
    public double calcularTarifa() {
        return 10.0;
    }
}