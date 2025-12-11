//interfaces are same as abstraction class but in interfaces we can implement multiple interfaces which is not possible in abstraction
interface one{
    void first(); //interface by default sets the methods as public abstract so no need to give it explicitly
}
interface two {
    void second();
}
class child implements one,two{
    public void first(){
        System.out.println("I am first abstracted method form interface one");
    }
    public void second(){
        System.out.println("I am second abstracted method from interface two");
    }
}

public class Interfaces{
    public static void main(String[] args){
        child c = new child();
        c.first();
        c.second();
    }
}