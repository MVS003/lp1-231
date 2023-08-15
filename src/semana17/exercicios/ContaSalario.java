package semana17.exercicios;

import java.time.LocalDate;

public class ContaSalario extends Conta {

    private Empresa empresa;

    public ContaSalario(int numero, LocalDate dataAbertura, Correntista correntista, Empresa empresa) {
        super(numero, dataAbertura, correntista);
        this.empresa = empresa;
    }

    @Override
    public double calcularTarifa() {
        return 15.0;
    }
}
