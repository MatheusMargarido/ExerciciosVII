package entities;
public class UserInput {
    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public static boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }
}
