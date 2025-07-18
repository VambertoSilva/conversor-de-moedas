package org.vamberto.app;

import org.vamberto.app.service.ConversorService;

import java.util.Scanner;

public class ConversorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorService conversor = new ConversorService();

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("=== MENU CONVERSOR ===");
            System.out.println("1 - Dólar (USD) → Real (BRL)");
            System.out.println("2 - Real (BRL) → Dólar (USD)");
            System.out.println("3 - Euro (EUR) → Dólar (USD)");
            System.out.println("4 - Dólar (USD) → Euro (EUR)");
            System.out.println("5 - Libra (GBP) → Real (BRL)");
            System.out.println("6 - Real (BRL) → Libra (GBP)");
            System.out.println("7 - Sair\n");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.print("Informe o valor a ser convertido: ");
                double valor = scanner.nextDouble();
                conversor.converter(opcao, valor);
            } else if (opcao != 7) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}