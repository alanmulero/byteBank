public class Contador extends Funcionario{
    private double total;
    // getters and setters


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    //metodo bonifica:
    public void registra(Funcionario item){
        this.total = this.total + item.bonifica();
        System.out.println("O total de bonificação é de: "+ total);
    }
}
