public class Gerente extends Funcionario{
    private  int senha = 11;

    public int getSenha() {
        return senha;
    }
    //construtor
    public Gerente(int senha){
        if (this.senha == senha){
            System.out.println("Senha validada com sucesso.");

        }else{
            System.out.println("Senha não confere.");

        }
    }


    public void setSenha(int senha) {
        if (this.senha == senha){
            System.out.println("Senha validada com sucesso.");

        }else{
            System.out.println("Senha não confere.");

        }
    }
    // Metodo bonifica
    public double bonifica(){
        return super.bonifica() + 3;
    }
}
