public class CriaContas extends Funcionario {
    public static void main(String[] args) {

        // Conta gerente
        Gerente gerenteUm = new Gerente(11);
        Cliente GerenteNovoUm = new Cliente("Alan",53,"555-27");
        gerenteUm.setTitular(GerenteNovoUm);
        gerenteUm.setSenha(11);
        gerenteUm.setSaldo(10);
        gerenteUm.setAgencia(3344);
        gerenteUm.setConta(555444);
        gerenteUm.deposita(20);
        System.out.println(gerenteUm.getConta());
        System.out.println("Saldo da conta Gerente um: "+gerenteUm.getSaldo());
        System.out.println(gerenteUm.getSenha());
        System.out.println(GerenteNovoUm.getNome());
        System.out.println(GerenteNovoUm.getIdade());
        System.out.println(gerenteUm.getTitular().getCpf());


        //Criando outra conta
        Gerente dois = new Gerente(11);
        Cliente gerenteDois = new Cliente("Jujuba",14,"12345-67");
        dois.setTitular(gerenteDois);
        dois.setSaldo(50);
        dois.transfere(10, gerenteUm);
        System.out.println();
        System.out.println("Saldo do gerente dois: "+ dois.getSaldo());
        dois.bonifica();
        System.out.println("Saldo do gerente dois depois do metodo bonifica: "+ dois.bonifica());

        System.out.println();
        System.out.println("Saldo da conta Gerente um depois da transferencia: "+ gerenteUm.getSaldo());

        //Criando conta do vendedor
        Vendedor vendedor = new Vendedor();
        vendedor.setSaldo(10);
        vendedor.bonifica();
        System.out.println("Saldo vendedor: "+ vendedor.getSaldo());
        System.out.println("Saldo vendedor depois do bonifica : "+ vendedor.bonifica());

        //Instanciando a classe Contador e validando o registro.
        Contador contador = new Contador();
        contador.registra(vendedor);
        contador.registra(gerenteUm);
        contador.registra(dois);
        // Instanciando Poupanca
        System.out.println("#################################");
        Poupanca poupanca = new Poupanca(1122,3344,10);
        poupanca.setSaldo(10);
        poupanca.saca(1);
        System.out.println("Saldo da poupança depois do saque: "+ poupanca.getSaldo());



    }
}
