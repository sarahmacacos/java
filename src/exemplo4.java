import java.util.Scanner;
public class exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome1, nome2;
        nome2 = "Unifil";
        System.out.println("Informe seu nome: ");
        nome1 = scanner.next();
        verificar(nome1, nome2);
    }
    static void verificar(String nome1, String nome2){
        if (nome1.equals(nome2)) {
            System.out.println("Nomes Iguais");
        } else {
            System.out.println("Nomes Diferentes");
        }
    }
}

