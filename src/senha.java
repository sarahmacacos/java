import java.util.Scanner;
public class senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
            if (!senha.equals("123456")) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (!senha.equals("123456"));
        System.out.println("Acesso liberado!");
        scanner.close();
    }
}
