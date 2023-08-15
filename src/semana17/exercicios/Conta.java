package semana17.exercicios;

import java.time.LocalDate;

public class Conta {
    
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = LocalDate.now();
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
    }

    public Conta(int numero, LocalDate dataAbertura, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = LocalDate.now();
        this.correntista = correntista;
        this.saldo = 0.0;
        this.tarifa = 0.0;
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double calcularTarifa() {
        return 0;
    }
}
