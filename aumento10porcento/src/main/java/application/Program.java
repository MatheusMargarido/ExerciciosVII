package application;

import java.util.Scanner;

import entities.PriceCalculator;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe o valor do produto: ");
            double preco = Double.parseDouble(scanner.nextLine());

            double novoPreco = PriceCalculator.aplicarAcrescimo(preco);
            System.out.printf("Novo valor do produto: %.2f\n", novoPreco);

        } catch (Exception e) {
            System.out.println("Número inválido, tente novamente.");
        }
    }
}