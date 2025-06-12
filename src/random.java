import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random = new Random();
         double sorteado = (int)((Math.random() * 40)+10);
            System.out.println(sorteado);

            int resultado = random.nextInt(10)+1;
            System.out.println(resultado);
        }
    }
