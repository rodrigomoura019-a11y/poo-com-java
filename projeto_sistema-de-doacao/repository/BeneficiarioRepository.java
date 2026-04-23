package repository;

import model.Beneficiario;
import java.util.ArrayList;
import java.util.List;

public class BeneficiarioRepository {
    private List<Beneficiario> beneficiarios = new ArrayList<>();

    public void salvar(Beneficiario beneficiario) {
        this.beneficiarios.add(beneficiario);
        System.out.println("✅ Beneficiário cadastrado: " + beneficiario.getNome());
    }

    public List<Beneficiario> listarBeneficiarios() {
        return this.beneficiarios;
    }
}