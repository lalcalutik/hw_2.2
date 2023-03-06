import java.util.Random;
import java.util.Arrays;
public class Slytherin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    Random random = new Random();
    public Slytherin(String name) {
        super(name);
        this.cunning = random.nextInt(100);;
        this.decisiveness = random.nextInt(100);;
        this.ambition = random.nextInt(100);;
        this.resourcefulness = random.nextInt(100);;
        this.lustForPower = random.nextInt(100);;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    private int force() {
        return cunning + decisiveness + ambition + resourcefulness + lustForPower;
    }

    public void comparisonSlytherin (Slytherin slytherin) {
        int force1=force();
        int force2=slytherin.force();
        if (force1> force2) {
            System.out.printf("Слизеринец: %s сильнее, чем слизеренец: %s.%n" , getName(),slytherin.getName());
        }
        else if (force1<force2) {
            System.out.printf("Слизеринец: %s сильнее, чем слизеренец: %s.%n" , slytherin.getName(),getName());
        }
        else {
            System.out.printf("Слизеринец: %s равен по силе слизеренцу: %s.%n"  , getName(),slytherin.getName());
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s; Хитрость: %d; Решительность: %d; Амбициозность: %d; Находчивость: %d; Жажда власти: %d.",
                super.toString(),
                cunning,
                decisiveness,
                ambition,
                resourcefulness,
                lustForPower
        );
    }
}
