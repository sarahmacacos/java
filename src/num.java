import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while (numero < 1 || numero > 10);
        System.out.println("Número válido! Você digitou: " + numero);
    }
}
