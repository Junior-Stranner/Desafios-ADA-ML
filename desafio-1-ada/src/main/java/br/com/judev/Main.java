package br.com.judev;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        // Entrada do usuário
        System.out.println("=== Cadastro de Produto ===");
        System.out.print("Digite o nome do produto: ");
        String nome = in.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        double preco = Double.parseDouble(in.nextLine());

        // Cria 0 produto com estoque inicial = 0
        Produto produto = new Produto(nome, preco);

        // Adicionar estoque
        System.out.print("Quantas unidades deseja adicionar ao estoque? ");
        int qtdAdd = Integer.parseInt(in.nextLine());
        produto.adicionarEstoque(qtdAdd);

        // Vender produto
        System.out.print("Quantas unidades deseja vender? ");
        int qtdVenda = Integer.parseInt(in.nextLine());
        produto.vender(qtdVenda);

        // Exibir resumo
        produto.exibirResumo();

    }
}