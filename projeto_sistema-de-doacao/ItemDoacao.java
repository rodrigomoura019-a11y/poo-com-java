import java.time.LocalDate;

public class ItemDoacao {
    private static int counter = 0;
    private final int id;
    private String nomeItem;
    private CategoriaItens categoria;
    private String descricao;
    private int quantidade;
    private EstadoDeConservacao estadoDeConservacao;
    private LocalDate dataDeCadastro;
    private Status status;
    
    public ItemDoacao(int id, String nomeItem, CategoriaItens categoria, String descricao, int quantidade,
            EstadoDeConservacao estadoDeConservacao, LocalDate dataDeCadastro, Status status) {
        this.id = ++counter;
        this.nomeItem = nomeItem;
        this.categoria = categoria;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estadoDeConservacao = estadoDeConservacao;
        this.dataDeCadastro = dataDeCadastro;
        this.status = status;
    }
   
    public int getId() {
        return id;
    }
    public String getNomeItem() {
        return nomeItem;
    }
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
    public CategoriaItens getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaItens categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public EstadoDeConservacao getEstadoDeConservacao() {
        return estadoDeConservacao;
    }
    public void setEstadoDeConservacao(EstadoDeConservacao estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }
    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }
    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

}
