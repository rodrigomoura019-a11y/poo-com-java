package model;

public class Usuario {
    // Doadores e Beneficiários têm o mesmo sitema de id
    private static int counter = 0;
    private final int id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    public Usuario(String nome, String telefone, String endereco) {
        this.id = ++counter;
        this.nome = nome;
        this.telefone = formatTelefone(telefone);
        this.endereco = endereco;
    }

    public Usuario(String nome, String telefone, String endereco, String email) {
        this(nome, telefone, endereco);
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = formatTelefone(telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    private String formatTelefone(String telefone) {
        String digits = telefone.replaceAll("\\D", "");
        if (digits.length() == 11) {
            return String.format("(%s) %s-%s", digits.substring(0, 2), digits.substring(2, 7), digits.substring(7));
        } else {
            throw new IllegalArgumentException("Número de telefone inválido. Deve ter 11 dígitos (XX) XXXXX-XXXX.");
        }
    }

}
