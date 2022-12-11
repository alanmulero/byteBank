public class Poupanca extends Funcionario {
    public Poupanca(int conta, int agencia,double saldo){
        super(conta,agencia,saldo);
    }

    @Override
    public void saca(double valor) {
        super.saca(valor + 0.10);
        System.out.println("Valor sacado foi: " + valor);
    }
}
