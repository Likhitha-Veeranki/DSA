
import java.time.LocalDate;            //to get time and date values (use LocalTime for time)

//anonymous class: A class without name which is created and used in the same time
class Animal {
    void sound() {
        System.out.println("default sound");
    }
}
//enums represent a group of constants
enum temp {
    COLD,TIMID,HOT
};               //even constructors are also possible with enum

public class OopLast {
    public static void main(String[] args) {

        Animal a = new Animal() {
            @Override    //optional but recommended
            void sound() {
                System.out.println("he....he....he....");
            }
        };

        a.sound();
        temp t = temp.COLD;
        System.out.println(t);
        System.out.println("\n");
        for(temp t1 :temp.values()){
            System.out.println(t1);
        }


        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
}




