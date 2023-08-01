package semana17.exercicios;

import java.time.LocalDate;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente (int numero, LocalDate dataAbertura, double saldo, double limite){
        super(numero, dataAbertura, saldo);
    }
}
