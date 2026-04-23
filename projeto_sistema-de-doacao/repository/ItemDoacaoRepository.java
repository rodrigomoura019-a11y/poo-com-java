package repository;

import java.util.ArrayList;
import java.util.List;

import model.ItemDoacao;

public class ItemDoacaoRepository {
    private List<ItemDoacao> itensDoacao = new ArrayList<>();

    public void salvar(ItemDoacao item){
        this.itensDoacao.add(item);
        System.out.println("Item cadastrado: " + item.getNomeItem());    
    }

    public List<ItemDoacao> listarItens(){
        return this. itensDoacao;
    }
}
