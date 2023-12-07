import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Generando 10 números aleatorios entre 1 y 100:");

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(100) + 1;
            System.out.println(randomNum);
        }
    }
}