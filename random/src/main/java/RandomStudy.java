import java.util.Random;

public class RandomStudy {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt() % 100;
        System.out.println(randomNumber);
    }

}
