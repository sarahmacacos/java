import java.util.Scanner;
public class subrotinas {
    public static void main(String[] args) {
        exibirIntroducao();

        Scanner scanner = new Scanner(System.in);
        double peso = lerValor(scanner, "Digite seu peso (kg): ");     // função com parâmetro e retorno
        double altura = lerValor(scanner, "Digite sua altura (m): ");  // função com parâmetro e retorno

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);

        exibirResultado(imc, classificacao);
        scanner.close();
    }
    public static void exibirIntroducao() {
        System.out.println("Cálculo de IMC");
        System.out.println("Vamos calcular seu Índice de Massa Corporal!");
    }
    public static double lerValor(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obesidade";
    }
    public static void exibirResultado(double imc, String classificacao) {
        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
        exibirMensagemSaudacao(); // procedimento sem parâmetro chamado dentro de outro
    }
    public static void exibirMensagemSaudacao() {
        System.out.println("Cuide mais da sua saúde!");
    }
}