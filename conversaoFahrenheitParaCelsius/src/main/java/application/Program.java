package application;

import java.util.Scanner;

import entities.TemperatureConverter;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe a temperatura em Fahrenheit: ");
            double f = Double.parseDouble(scanner.nextLine());

            double celsius = TemperatureConverter.fahrenheitToCelsius(f);
            System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);

        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
        }
    }
}
