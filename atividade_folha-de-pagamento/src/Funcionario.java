public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public double calcularSalario(){
        double salariocalculado = getSalarioBase();
        return salariocalculado;
    }

    public String informacoes(){
        return "\n Funcionário: " + getNome() + "\n Salário Final: " + calcularSalario() + "\n";
    }
}
