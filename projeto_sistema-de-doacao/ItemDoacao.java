import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    
    public ItemDoacao(String nomeItem, CategoriaItens categoria, String descricao, int quantidade,
            EstadoDeConservacao estadoDeConservacao, Status status) {
        this.id = ++counter;
        this.nomeItem = nomeItem;
        this.categoria = categoria;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estadoDeConservacao = estadoDeConservacao;
        this.dataDeCadastro = LocalDate.now();
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
        return this.categoria;
    }
    public void setCategoria(CategoriaItens categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public EstadoDeConservacao getEstadoDeConservacao() {
        return this.estadoDeConservacao;
    }
    public void setEstadoDeConservacao(EstadoDeConservacao estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }
    //mudo para o formato convencional do Brasil e transformo em String
    public String getDataDeCadastroFormatada() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataDeCadastro.format(formatador);
    }
    public Status getStatus() {
        return this.status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

}
