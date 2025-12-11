//used to hide certain details from the user. abstract classes can not be used to create objects
abstract class Person {
    abstract String getIdentity();

    void institute() {
        System.out.println("Learning University");
    }
}

class Student extends Person {
    String getIdentity() {
        return "student";
    }
}

class Faculty extends Person {
    String getIdentity() {
        return "faculty";
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Person stu = new Student();
        Person fac = new Faculty();

        System.out.println(stu.getIdentity() + " : ");
        stu.institute();

        System.out.println(fac.getIdentity() + " : ");
        fac.institute();
    }
}
