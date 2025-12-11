class SuperClass{     //you can add final as prefix if you dont want it to be inherited
     int parentAge=40;
}
class SubClass extends SuperClass{
     int childAge=18;
}
public class Inheritance {
    public static void main(String[] args){
        SubClass obj = new SubClass();
        System.out.println("Parent age from child class= "+obj.parentAge);
        System.out.println("Child age = "+obj.childAge);

    }
}