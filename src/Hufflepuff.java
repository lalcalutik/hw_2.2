import java.util.Random;
import java.util.Arrays;
public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    Random random = new Random();

    public Hufflepuff(String name) {
        super(name);
        this.industriousness = random.nextInt(100);;
        this.loyalty = random.nextInt(100);;
        this.honesty = random.nextInt(100);;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    private int force() {
        return industriousness + loyalty + honesty;
    }

    public void comparisonHufflepuff (Hufflepuff hufflepuff) {
        int force1=force();
        int force2=hufflepuff.force();
        if (force1> force2) {
            System.out.printf("Пуффендуец: %s сильнее, чем пуффендуец: %s.%n" , getName(),hufflepuff.getName());
        }
        else if (force1<force2) {
            System.out.printf("Пуффендуец: %s сильнее, чем пуффендуец: %s.%n" , hufflepuff.getName(),getName());
        }
        else {
            System.out.printf("Пуффендуец: %s равен по силе пуффендуйцу: %s.%n"  , getName(),hufflepuff.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; Трудолюбие: %d; Верность: %d; Честность: %d.", super.toString(), industriousness, loyalty, honesty);
    }

}
