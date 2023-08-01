package semana17.exercicios;

import java.time.LocalDate;

public class Conta {
    public int numero;
    public LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;

    public Conta (int numero, LocalDate dataAbertura, double saldo) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void sacar (double valor) {
        if (valor <= 0) {
            System.out.println("Não é possivel sacar esse valor");
        }
        if (valor > saldo){
            System.out.println("Seu saldo é menor que o valor digitado");
        }
        double novosaldo = saldo - valor;
        System.out.println("Novo saldo ="+ novosaldo);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Não é possivel depositar esse valor");
        }
        double novosaldo = saldo + valor;
        System.out.println("Novo saldo ="+ novosaldo);
    }

}
