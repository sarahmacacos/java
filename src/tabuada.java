import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para fazer a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
