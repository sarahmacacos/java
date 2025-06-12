import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Enquanto = while
        int i = 0;
        int soma = 0;
        while (i <= 10) {
            soma += i;
            i++;
            System.out.println(i);
        }
        System.out.println("A Soma dos números é 55");
    }
}