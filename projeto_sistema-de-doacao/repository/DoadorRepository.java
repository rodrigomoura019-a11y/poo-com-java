package repository;

import model.Doador;
import java.util.ArrayList;
import java.util.List;

public class DoadorRepository {
    private List<Doador> doadores = new ArrayList<>();

    public void salvar(Doador doador) {
        this.doadores.add(doador);
        System.out.println("Doador cadastrado: " + doador.getNome());
    }

    public List<Doador> listarDoadores() {
        return this.doadores;
    }
}