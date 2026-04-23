package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record DoacaoEfetivada(
        int id,
        ItemDoacao item,
        Doador doador,
        Beneficiario beneficiario,
        LocalDate dataDoacao,
        String observacoes) {

    // variável compartilhada
    private static int counter = 0;

    public DoacaoEfetivada(ItemDoacao item, Doador doador, Beneficiario beneficiario, String observacoes) {
        this(++counter, item, doador, beneficiario, LocalDate.now(), observacoes);
    }

    public String getDataDeCadastroFormatada() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataDoacao.format(formatador);
    }
}
