package model.enums;

public enum Status {
    DISPONIVEL("Disponível"),
    RESERVADO("Reservado"),
    ENTREGUE("Entregue"),
    CANCELADO("Cancelado");

    private final String descricao;

    private Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
