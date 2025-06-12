import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        int i = numero;
        while (i > 1) {
            fatorial *= i; // fatorial = fatorial * i
            i--;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}