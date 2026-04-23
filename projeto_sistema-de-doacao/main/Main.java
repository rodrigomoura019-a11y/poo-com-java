package main;

import model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("João", "11999999999", "Rua A");
        System.out.println("ID: " + u1.getId() + ", Telefone: " + u1.getTelefone());

    }
}
