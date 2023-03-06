import java.util.Arrays;
import java.util.Random;
public class Gryffindor extends Hogwarts {

        private int nobility;
        private int honor;
        private int bravery;

        Random random = new Random();

        public Gryffindor(String name) {
                super(name);
                this.nobility = random.nextInt(100);
                this.honor = random.nextInt(100);
                this.bravery = random.nextInt(100);
        }

        public int getNobility() {
                return nobility;
        }

        public int getHonor() {
                return honor;
        }

        public int getBravery() {
                return bravery;
        }

        private int force() {
                return nobility + honor + bravery;
        }

        public void comparisonGryffindor (Gryffindor gryffindor) {
                int force1=force();
                int force2=gryffindor.force();
                if (force1> force2) {
                        System.out.printf("Гриффиндорец: %s сильнее, чем гриффиндорец: %s.%n" , getName(),gryffindor.getName());
                }
                else if (force1<force2) {
                        System.out.printf("Гриффиндорец: %s сильнее, чем гриффиндорец: %s.%n" , gryffindor.getName(),getName());
                }
                else {
                        System.out.printf("Гриффиндорец: %s равен по силе гриффиндорцу: %s.%n"  , getName(),gryffindor.getName());
                }
        }

        @Override
        public String toString() {
                return String.format("%s; Благородство: %d; Честь: %d; Храбрость: %d.", super.toString(), nobility, honor, bravery);
        }

}

