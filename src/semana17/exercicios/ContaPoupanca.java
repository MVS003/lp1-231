package semana17.exercicios;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

    private LocalDate aniversario;

    public ContaPoupanca(int numero, LocalDate dataAbertura, Correntista correntista, LocalDate aniversario) {
        super(numero, dataAbertura, correntista);
        this.aniversario = aniversario;
    }

    @Override
    public double calcularTarifa() {
        return 5.0;
    }
    
}