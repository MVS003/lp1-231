package semana12.exercicios;

public class Conta {
    /*Crie uma classe Conta que representa uma conta em um banco. 
    Essa classe deve ter os atributos codigo (int), saldo (double) e correntista (String). 
    Ao criar uma conta devem ser passado os valores para codigo, correntista e o saldo deve ter o valor 0.0.
    Implemente métodos para sacar, depositar e transferir valores.
    Escreva testes de unidade para todos os métodos da classe. */

    public int codigo;
    public double saldo;
    public String correntista;

    public Conta (int codigo, String correntista) {
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double sacar (double valor) {
        if (valor <= 0) {
            System.out.println("Não é possivel sacar esse valor");
            return 0;
        }
        if (valor > saldo){
            System.out.println("Seu saldo é menor que o valor digitado");
            return 0;
        }
        return saldo - valor;
    }


    public double depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Não é possivel depositar esse valor");
            return 0;
        }
        return saldo + valor;
    }

    public double transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            System.out.println("Não é possível transferir esse valor");
            return 0;
        }
        if (valor > saldo) {
            System.out.println("Seu saldo é menor que o valor digitado");
            return 0;
        }
        contaDestino.saldo = saldo + valor;
        return saldo - valor;
    }
}
