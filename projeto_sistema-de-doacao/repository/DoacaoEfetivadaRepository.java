package repository;

import model.DoacaoEfetivada;
import model.ItemDoacao;
import model.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class DoacaoEfetivadaRepository {
    private List<DoacaoEfetivada> doacoes = new ArrayList<>();

    public void salvar(DoacaoEfetivada doacao) {
        ItemDoacao item = doacao.item();

        if (item.getStatus() != Status.DISPONIVEL) {
            System.out.println("Erro: A doação não pode ser concluída. O item já foi doado ou está reservado!");
            return;
        }
        
        this.doacoes.add(doacao);
        item.setStatus(Status.DOADO);
        System.out.println("Doação registrada com sucesso! Recibo Nº: " + doacao.id());

    }

    public List<DoacaoEfetivada> listarRecibos() {
        return this.doacoes;
    }
}
