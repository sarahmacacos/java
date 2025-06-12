import java.util.Scanner;
public class exemplo2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("Opção 1: soma");
            System.out.println("Opção 2: multiplicação");
            System.out.println("Opção 3: Sair ");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Você escolheu soma!"); break;
                case 2:
                    System.out.println("Você escolheu multiplicação!"); break;
                case 3:
                    System.out.println("Encerrando!");
            }

        }while (op != 3);

        }

    }