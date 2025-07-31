package br.com.judev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Funcionário 1 - com hospedagem, menos de 7 dias
        Reembolso r1 = new Reembolso("Carla", 5);
        double total1 = r1.calcularReembolso(100.0, 50.0, 150.0);
        r1.imprimirResumoReembolso(total1);

        // Funcionário 2 - sem hospedagem, mais de 7 dias (testar bônus)
        Reembolso r2 = new Reembolso("João", 10);
        double total2 = r2.calcularReembolso(120.0, 80.0); // sem hospedagem
        r2.imprimirResumoReembolso(total2);

        // Funcionário 3 - com hospedagem, exatamente 7 dias (sem bônus)
        Reembolso r3 = new Reembolso("Ana", 7);
        double total3 = r3.calcularReembolso(90.0, 60.0, 200.0);
        r3.imprimirResumoReembolso(total3);
    }
}