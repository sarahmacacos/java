import java.util.Random;
public class senhasale {
    public static void main(String[] args) {
        String senha = gerarSenha(12); // Tamanho pode ser alterado
        System.out.println("Senha gerada: " + senha);
        if (senhaForte(senha)) {
            System.out.println("Senha forte!");
        } else {
            System.out.println("Senha fraca. Tente outra.");
        }
    }
    public static String gerarSenha(int tamanho) {
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String simbolos = "!@#$%&*()_-+=<>?";

        String todosOsCaracteres = letrasMinusculas + letrasMaiusculas + numeros + simbolos;

        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(todosOsCaracteres.length());
            senha.append(todosOsCaracteres.charAt(indice));
        }
        return senha.toString();
    }
    public static boolean senhaForte(String senha) {
        return temLetraMaiuscula(senha) &&
            temLetraMinuscula(senha) &&
            temNumero(senha) &&
            temSimbolo(senha) &&
            senha.length() >= 8;
    }
    public static boolean temLetraMaiuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }
    public static boolean temLetraMinuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }
    public static boolean temNumero(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
    public static boolean temSimbolo(String senha) {
        String simbolos = "!@#$%&*()_-+=<>?";
        for (char c : senha.toCharArray()) {
            if (simbolos.contains(String.valueOf(c))) return true;
        }
        return false;
    }
}