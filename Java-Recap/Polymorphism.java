//same method performing different tasks is called polymorphism
/*
class parent{
    void occupation(){
        System.out.println("Teacher");
    }
}
class child extends parent {
    void occupation(){
        System.out.println("Student");
    }
    void parentOccupation(){
        super.occupation();           //super keyword is used to refer to the parent class
    }
}


public class Polymorphism{
    public static void main(String[] args){
        parent p = new parent();
        child c = new child();
        System.out.println("occupation of parent is:");
        p.occupation();
        System.out.println("occupation of child is:");
        c.occupation();
        System.out.println("occupation of parent is(from child class using superkeyword):");
        c.parentOccupation();
    }
}
*/


//inner class or nested class
class outer{
    String where ="outer class";
    class inner{            //if inner class is private it can not be accessed
        String where ="inner class";
    }
}

class nested{
    public static void main(String[] args){
        outer o = new outer();
        outer.inner i = o.new inner();          //if inner class is static we can use new o.inner()
        System.out.println("Where (from outer class): "+o.where);
        System.out.println("Where (from inner class): "+i.where);

    }
}