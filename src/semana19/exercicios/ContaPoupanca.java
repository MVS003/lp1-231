package semana19.exercicios;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{
    
    private LocalDate aniversario;

    public ContaPoupanca(int numero, double tarifa, LocalDate aniversario, Correntista correntista){
        super(numero, tarifa, correntista);
        this.aniversario = aniversario;
    }

    @Override

    public double calcularTarifa(){
        return this.tarifa;
    }
}