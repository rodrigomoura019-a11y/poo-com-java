package model.enums;

public enum EstadoDeConservacao {

    NOVO("Novo"),
    BOM_ESTADO("Bom Estado"),
    USADO("Usado"),
    DEFEITUOSO("Com Defeito");

    private final String descricao;

    EstadoDeConservacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}