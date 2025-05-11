package application;

import java.util.Scanner;

import entities.MediaCalculator;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double n1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o segundo número: ");
            double n2 = Double.parseDouble(scanner.nextLine());

            double media = MediaCalculator.calcularMedia(n1, n2);
            System.out.printf("Média: %.2f\n", media);

        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
        }
    }
}
