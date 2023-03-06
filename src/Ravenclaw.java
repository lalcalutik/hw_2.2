import java.util.Random;
import java.util.Arrays;
public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    Random random = new Random();
    public Ravenclaw(String name) {
        super(name);
        this.intelligence = random.nextInt(100);;
        this.wisdom = random.nextInt(100);;
        this.wit = random.nextInt(100);;
        this.creativity = random.nextInt(100);;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    private int force() {
        return intelligence + wisdom + wit + creativity;
    }

    public void comparisonRavenclaw (Ravenclaw ravenclaw) {
        int force1=force();
        int force2=ravenclaw.force();
        if (force1> force2) {
            System.out.printf("Когтевранец: %s сильнее, чем когтевранец: %s.%n" , getName(),ravenclaw.getName());
        }
        else if (force1<force2) {
            System.out.printf("Когтевранец: %s сильнее, чем когтевранец: %s.%n" , ravenclaw.getName(),getName());
        }
        else {
            System.out.printf("Когтевранец: %s равен по силе когтевранцу: %s.%n"  , getName(),ravenclaw.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; Ум: %d; Мудрость: %d; Сообразительность: %d; Творчество: %d.", super.toString(), intelligence, wisdom, wit, creativity);
    }
}
