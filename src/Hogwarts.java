import java.util.Random;
public class Hogwarts {

    private String name;
    private int spellPower;
    private int transgression;

    Random random = new Random();

    public Hogwarts(String name) {
        this.name = name;
        this.spellPower = random.nextInt(100);
        this.transgression = random.nextInt(100) ;
    }

    public String getName() {
        return name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    private int force() {
        return spellPower + transgression;
    }


    public void print() {
        System.out.println(this);
    }

    public void comparisonHogwarts (Hogwarts hogwarts) {
        int force1=force();
        int force2=hogwarts.force();
        if (force1> force2) {
            System.out.printf("Студент %s сильнее, чем студет %s.%n" , getName(),hogwarts.getName());
        }
        else if (force1<force2) {
            System.out.printf("Студент %s сильнее, чем студет %s.%n" , hogwarts.getName(),getName());
        }
        else {
            System.out.printf("Студент %s равен по силе студенту %s.%n"  , getName(),hogwarts.getName());
        }
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ","
                + " Сила магии: " + getSpellPower() + ","
                + " Трансгрессия: " + getTransgression();
    }
}
