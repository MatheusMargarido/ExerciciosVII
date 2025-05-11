package application;

import java.util.Scanner;

import entities.UserInput;

public class Program {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        if (!UserInput.isValidName(nome)) {
            System.out.println("Nome não pode ser vazio.");
            return;
        }

        System.out.print("Digite o CPF (11 dígitos): ");
        String cpf = scanner.nextLine();
        if (!UserInput.isValidCPF(cpf)) {
            System.out.println("CPF inválido.");
            return;
        }

        System.out.print("Digite a idade: ");
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida.");
            return;
        }

        if (!UserInput.isValidAge(idade)) {
            System.out.println("Idade inválida.");
            return;
        }

        System.out.printf("Nome: %s\nCPF: %s\nIdade: %d\n", nome, cpf, idade);
    }
}
