public class Desenvolvedor extends Funcionario{
    private double horasExtras;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, double horasExtras, double valorHoraExtra){
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    @Override
    public double calcularSalario(){
        double salarioCalculado = getSalarioBase();
        return salarioCalculado += (getHorasExtras() * getValorHoraExtra());
    }

    @Override
    public String informacoes(){
        return "\n Desenvolvedor: " + getNome() + "\n Salário Final: " + calcularSalario() + "\n";
    }
}
