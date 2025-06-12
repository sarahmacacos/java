import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu SOMAR."); break;
                case 2:
                    System.out.println("Você escolheu SUBTRAIR."); break;
                case 3:
                    System.out.println("Saindo do programa..."); break;
            }

        } while (opcao != 3);

        scanner.close();
    }
}
