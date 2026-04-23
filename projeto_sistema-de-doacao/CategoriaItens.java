public enum CategoriaItens {
    AGUA("Água"),
    ALIMENTOS("Alimentos"),
    BRINQUEDOS("Brinquedos"),
    CAMA_MESA_BANHO("Cama, Mesa e Banho"),
    ELETRODOMESTICOS("Eletrodomésticos"),
    HIGIENE_PESSOAL("Higiene Pessoal"),
    LIMPEZA("Limpeza"),
    LIVROS("Livros"),
    MEDICAMENTOS("Medicamentos"),
    VESTUARIO("Vestuário");

    private final String descricao;

    CategoriaItens(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
