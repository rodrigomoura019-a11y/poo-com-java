package main;

import model.*;
import model.enums.*;
import repository.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SISTEMA DE GESTÃO DE DOAÇÕES - TESTE   ");
        System.out.println("==========================================\n");

        // 1. Instanciando os Repositórios (Nossos Bancos de Dados)
        DoadorRepository doadorRepo = new DoadorRepository();
        BeneficiarioRepository benefiRepo = new BeneficiarioRepository();
        ItemDoacaoRepository itemRepo = new ItemDoacaoRepository();
        DoacaoEfetivadaRepository doacaoRepo = new DoacaoEfetivadaRepository();

        // 2. Criando e Salvando Usuários
        Doador joaoPaulo = new Doador("João Paulo", "79 9999-9999", "Aracaju-SE", "jpdantas@gmail.com");
        doadorRepo.salvar(joaoPaulo);

        Beneficiario hospital1 = new Beneficiario("Hospital de Cancer de Pernambuco", "81 93454-7468", "Av. Cruz Cabugá, 1597 - Santo Amaro, Recife - PE, 50040-000", TipoDeBeneficiario.HOSPITAL, Prioridade.MEDIA );
        benefiRepo.salvar(hospital1);

        // 3. Criando Itens e Salvando no Estoque
        ItemDoacao cesta = new ItemDoacao("Cesta Básica Familiar", CategoriaItens.ALIMENTOS, "Arroz, feijão, óleo e açúcar", 1, EstadoDeConservacao.NOVO, Status.DISPONIVEL);
        ItemDoacao notebook = new ItemDoacao("Notebook Dell", CategoriaItens.ELETRODOMESTICOS, "8GB RAM, SSD 256GB", 1, EstadoDeConservacao.BOM_ESTADO, Status.DISPONIVEL);
        
        itemRepo.salvar(cesta);
        itemRepo.salvar(notebook);

        // ---------------------------------------------------------
        // 4. TESTE 1: DOAÇÃO BEM-SUCEDIDA
        // ---------------------------------------------------------
        System.out.println("\n--- TESTE 1: Realizando Doação Válida ---");
        DoacaoEfetivada recibo1 = new DoacaoEfetivada(cesta, joaoPaulo, hospital1, "Entrega realizada no centro de distribuição.");
        doacaoRepo.salvar(recibo1);

        // ---------------------------------------------------------
        // 5. TESTE 2: TENTATIVA DE DOAR ITEM JÁ DOADO (SEGURANÇA)
        // ---------------------------------------------------------
        System.out.println("\n--- TESTE 2: Tentativa de Doação Duplicada (Deve dar Erro) ---");
        // Tentando doar a mesma 'cesta' que agora está com Status.DOADO
        DoacaoEfetivada reciboInvalido = new DoacaoEfetivada(cesta, joaoPaulo, hospital1, "Tentativa duplicada");
        doacaoRepo.salvar(reciboInvalido);

        // ---------------------------------------------------------
        // 6. TESTE 3: LISTAGEM FINAL (O que sobrou e o que foi feito)
        // ---------------------------------------------------------
        System.out.println("\n==========================================");
        System.out.println("         RELATÓRIO FINAL DO SISTEMA       ");
        System.out.println("==========================================");

        System.out.println("\n>>> HISTÓRICO DE DOAÇÕES REALIZADAS:");
        if (doacaoRepo.listarDoacoesEfetivadas().isEmpty()) {
            System.out.println("Nenhuma doação registrada.");
        } else {
            for (DoacaoEfetivada d : doacaoRepo.listarDoacoesEfetivadas()) {
                System.out.println("ID #" + d.id() + " | Item: " + d.item().getNomeItem() + 
                                   " | Para: " + d.beneficiario().getNome() + 
                                   " | Data: " + d.getDataDeCadastroFormatada());
            }
        }

        System.out.println("\n>>> ESTADO ATUAL DO ESTOQUE:");
        for (ItemDoacao i : itemRepo.listarItens()) {
            // Aqui usamos o getDescricao() para o usuário ler bonito
            System.out.println("- " + i.getNomeItem() + " | Status: " + i.getStatus().getDescricao());
        }
        
        System.out.println("\n==========================================");
    }
}
