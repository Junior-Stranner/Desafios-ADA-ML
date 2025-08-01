package br.com.judev.model;

import br.com.judev.utlis.SegurancaUtils;

public class Administrador extends Usuario {
    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals(getSenha());
    }

    public void redefinirSenha(String novaSenha) {
        if (SegurancaUtils.validarSenhaForte(novaSenha)) {
            setSenha(novaSenha);
            System.out.println("Senha redefinida com sucesso!");
        } else {
            System.out.println("A senha não atende aos requisitos de segurança.");
        }
    }
}
