package model.enums;

public enum Status {
    DISPONIVEL("Disponivel"),
    RESERVADO("Reservado"),
    DOADO("Doado");

    private final String descricao;

    private Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
