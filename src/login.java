import java.util.Scanner;
public class login {
    static final String USERC = "admin";
    static final String SENHAC   = "123456";
    public static boolean validarCredenciais(String usuario, String senha) {
        boolean b = usuario.equals(USERC) && senha.equals(SENHAC);
        if (b) {
            return true;
        } else  {
            return false;
        }
    }
    public static void exibirMensagemBoasVindas() {
        System.out.println("Bem-vindo! Validade Autenticada.");
    }

    public static void exibirMensagemErro() {
        System.out.println("Credenciais incorretas. Por favor, tente novamente.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = false;
        while (!autenticado) {
            System.out.print("Digite o nome de usuário: ");
            String usuarioEntrada = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senhaEntrada = scanner.nextLine();

            if (validarCredenciais(usuarioEntrada, senhaEntrada)) {
                exibirMensagemBoasVindas();
                autenticado = true;
            } else {
                exibirMensagemErro();
            }
        }
    }
}
