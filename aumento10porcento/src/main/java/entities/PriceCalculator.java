package entities;

public class PriceCalculator {
    public static double aplicarAcrescimo(double preco) {
        if (preco <= 0) throw new IllegalArgumentException("Número inválido.");
        return preco * 1.10;
    }
}

