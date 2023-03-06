import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

     Gryffindor[] gryffindors = {
             new Gryffindor("Гарри Поттер"),
             new Gryffindor("Гермиона Грейнджер"),
             new Gryffindor("Рон Уизли"),
     };

     Hufflepuff[] hufflepuffs = {
             new Hufflepuff("Захария Смит"),
             new Hufflepuff("Седрик Диггори"),
             new Hufflepuff("Джастин Финч-Флетчли"),
     };

     Ravenclaw[] ravenclaws = {

             new Ravenclaw("Чжоу Чанг" ),
             new Ravenclaw("Падма Патил" ),
             new Ravenclaw("Маркус Белби" ),
     };

     Slytherin[] slytherins = {

             new Slytherin("Драко Малфой"),
             new Slytherin("Грэхэм Монтегю"),
             new Slytherin("Грегори Гойл"),
     };


     System.out.printf("________________________ %nГриффиндорцы: %n");
     gryffindors[0].print();
     gryffindors[1].print();
     gryffindors[2].print();
     System.out.printf("________________________%nПуффендуйцы: %n");
     hufflepuffs[0].print();
     hufflepuffs[1].print();
     hufflepuffs[2].print();
     System.out.printf("________________________%nКогтевранцы: %n");
     ravenclaws[0].print();
     ravenclaws[1].print();
     ravenclaws[2].print();
     System.out.printf("________________________%nСлизеренцы: %n");
     slytherins[0].print();
     slytherins[1].print();
     slytherins[2].print();
     System.out.printf("________________________%nСравнения студентов внутри факультетов: %n");

     gryffindors[1].comparisonGryffindor(gryffindors[2]);
     System.out.printf("________________________%nСравнения студентов между факультетами: %n");
     slytherins[0].comparisonHogwarts(gryffindors[0]);
     System.out.println("________________________");

    }


}