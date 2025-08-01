package br.com.judev;

import br.com.judev.model.Administrador;
import br.com.judev.utlis.SegurancaUtils;

public class Sistema {
    public static void main(String[] args) {
        // Criando um administrador
        Administrador admin = new Administrador("João Silva", "joao@empresa.com", "senha1234");

        // Tentando acessar atributos diretamente:
        System.out.println("Acessando atributos diretamente:");
        System.out.println("Nome: " + admin.nome); // Acessível (public)
        // System.out.println(admin.email); // Não acessível (protected - só na herança)
        // System.out.println(admin.senha); // Não acessível (private)

        // Usando métodos
        System.out.println("\nAutenticação:");
        System.out.println("Autenticação com senha errada: " + admin.autenticar("errada"));
        System.out.println("Autenticação com senha correta: " + admin.autenticar("senha1234"));

        // Exibindo usuário
        System.out.println("\nExibindo usuário:");
        admin.exibirUsuario();

        // Redefinindo senha
        System.out.println("\nRedefinindo senha:");
        admin.redefinirSenha("nova123"); // Senha fraca (menos de 8 caracteres)
        admin.redefinirSenha("novasenha123"); // Senha forte

        // Validando senha diretamente com SegurancaUtils
        System.out.println("\nValidando senhas com SegurancaUtils:");
        System.out.println("'abc123': " + SegurancaUtils.validarSenhaForte("abc123"));
        System.out.println("'senhasegura123': " + SegurancaUtils.validarSenhaForte("senhasegura123"));
    }
}
