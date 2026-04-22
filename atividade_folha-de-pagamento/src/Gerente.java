public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalario(){
        double salariocalculado = getSalarioBase();
        return salariocalculado += getBonus();
    }

    @Override
        public String informacoes(){
        return "\n Gerente: " + getNome() + "\n Salário Final: " + calcularSalario() + "\n";
    }

}
