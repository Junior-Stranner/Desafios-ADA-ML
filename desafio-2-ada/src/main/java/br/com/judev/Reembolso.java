package br.com.judev;

public class Reembolso {
    String nomeFuncionario;
    int diasTrabalhados;

    public Reembolso(String nomeFuncionario, int diasTrabalhados) {
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }

    // Método com hospedagem
    public double calcularReembolso(double alimentacao, double transporte, double hospedagem) {
        return alimentacao + transporte + hospedagem;
    }

    // Método sobrecarregado (sem hospedagem)
    public double calcularReembolso(double alimentacao, double transporte) {
        return alimentacao + transporte;
    }

    public void imprimirResumoReembolso(double valorTotal) {
        if (diasTrabalhados > 7) {
            valorTotal *= 1.10; // aplica o bônus de 10%
        }
        String mensagem = "Funcionário: " + nomeFuncionario +
                " – Dias Trabalhados: " + diasTrabalhados +
                " – Reembolso Total: R$ " + String.format("%.2f", valorTotal);

        System.out.println(mensagem);
    }
}
