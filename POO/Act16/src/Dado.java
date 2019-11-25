import java.util.Random;

public class Dado {
    public int tirada() {
        Random random = new Random();
        return random.nextInt(7) + 1;
    }
}
