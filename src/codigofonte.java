import java.util.Scanner;
public class codigofonte {
    static String[] produtos = {"1 - Ibuprofeno", "2 - Tylenol", "3 - Suplemento Alimentar", "4 - Dipirona"};
    static double[] precos = {50.0, 80.0, 120.0, 30.0};

    static double total = 0;
    static String itens = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo à loja virtual!");
        do {
            mostrarProdutos();
            System.out.print("Digite o código do produto (0 para finalizar): ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= produtos.length) {
                adicionarItem(opcao);
            } else if (opcao != 0) {
                System.out.println("Código inválido!");
            }

        } while (opcao != 0);

        mostrarResumoFinal();
        scanner.close();
    }
    public static void mostrarProdutos() {
        System.out.println("\n--- Produtos disponíveis ---");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("%s - R$ %.2f%n", produtos[i], precos[i]);
        }
    }
    public static void adicionarItem(int codigo) {
        int index = codigo - 1;
        total += precos[index];
        itens += produtos[index] + " (R$ " + precos[index] + ")\n";
        System.out.println(" " + produtos[index] + " adicionado ao carrinho.");
    }
    public static double aplicarDesconto(double valor) {
        if (valor > 100) {
            return valor * 0.9; // 10% de desconto
        }
        return valor;
    }

    // Procedimento: mostra o resumo final da compra
    public static void mostrarResumoFinal() {
        System.out.println("\nCOMPRA");
        System.out.println("Itens comprados:");
        System.out.print(itens);

        double totalComDesconto = aplicarDesconto(total);
        if (totalComDesconto < total) {
            System.out.printf("Total: R$ %.2f (Desconto aplicado)%n", totalComDesconto);
        } else {
            System.out.printf("Total: R$ %.2f%n", totalComDesconto);
        }
    }
}
