package br.com.judev;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
        } else if (quantidade <= estoque) {
            this.estoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades.");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

    public void exibirResumo() {
        System.out.println("=== Resumo do Produto ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Estoque disponível: " + estoque + " unidades");
        System.out.println("==========================");
    }

}

