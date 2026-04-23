public class Beneficiario extends Usuario{
    private TipoDeBeneficiario tipo;
    private Prioridade prioridade;

    //sem email
    public Beneficiario(String nome, String telefone, String endereco, TipoDeBeneficiario tipo, Prioridade prioridade) {
        super(nome, telefone, endereco);
        this.tipo = tipo;
        this.prioridade = prioridade;
    }
    //com email
    public Beneficiario(String nome, String telefone, String endereco, String email, TipoDeBeneficiario tipo, Prioridade prioridade) {
        super(nome, telefone, endereco, email);
        this.tipo = tipo;
        this.prioridade = prioridade;
    }

    public void setTipo(TipoDeBeneficiario tipo) {
        this.tipo = tipo;
    }

    public TipoDeBeneficiario getTipo() {
        return tipo;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

}
