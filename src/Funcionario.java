public abstract class Funcionario {
    private int conta;
    private int agencia;
    private double saldo;
    private Cliente titular;
    // Construtor
    public Funcionario(){}
    public Funcionario(int conta, int agencia, double saldo){
        this.conta = conta;
        System.out.println("Conta: "+conta);
        this.agencia = agencia;
        System.out.println("Agencuia: "+agencia);
        this.saldo = saldo;
        System.out.println("Saldo:"+saldo);
    }

    //getters and setters.


    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setCliente(Cliente titula){
        this.titular =  titular;
    }

    // Metodos
    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Valor sacado: "+ valor);
    }
    public void saca(double valor){
        this.saldo -= valor;
        System.out.println("Valor sacado: "+ valor);
    }
    // Metodo transfere:
    public boolean transfere(double valor, Funcionario destino){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            destino.deposita(valor);
            System.out.printf("O valor transferido para conta %s  foi de %2f",destino,  valor);
            return true;
        }
            else{
                System.out.println("Saldo indisponivél");
                return false;
            }


    }
    // metodo bonifica
    public double bonifica(){

        return this.saldo;

    }
}
