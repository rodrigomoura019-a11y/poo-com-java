package model;

import model.enums.Status;

public class Solicitacao {
    private static int counter = 0;
    private final int id;
    private Beneficiario beneficiario;
    private ItemDoacao item;
    private int quantidade;
    private String justificativa;
    private Status status;

    public Solicitacao(Beneficiario beneficiario, ItemDoacao item, int quantidade, String justificativa,
            Status status) {
        this.id = ++counter;
        this.beneficiario = beneficiario;
        this.item = item;
        this.quantidade = quantidade;
        this.justificativa = justificativa;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public Beneficiario getBeneficiario() {
        return this.beneficiario;
    }

    public ItemDoacao getItem() {
        return this.item;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public String getStatus() {
        return this.status.getDescricao();
    }

}