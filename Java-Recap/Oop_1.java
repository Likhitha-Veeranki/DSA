class Practice{
    int x=10;       // to stop overriding of x make it final.
    void myMethod(){     //method
        System.out.println("i am from practice class");
    }
 
    Practice(){                     //constructor
        System.out.println("I am practice class constructor");
    }

    Practice(int n){                //Constructor overloading
        //this();                   //calling another consturctor of same class
        System.out.println("this is from parametered consturctor with value= "+n);
    }
    void change(int x){         //this used to address current object 
        this.x=x;
    }
}

class Oop{
public static void main(String[] args){
    Practice obj = new Practice();
    System.out.println(obj.x); //accessing
    obj.x=40;                  //modification or overriding    
    System.out.println(obj.x);

    Practice obj1 = new Practice(); //multiple objects
    System.out.println(obj1.x);
    obj1.myMethod();                  //calling method

    Practice obj2 = new Practice(5);
    obj2.change(2);
    System.out.println(obj2.x);
    System.out.println(obj1.x);      //its value do not change because we changed x value for obj2 object only.


// for classes access modifiers:- public and default
//for methods attributes and constructors access modifiers are:- public, private, default, protected

//non access modifiers are:- final, static, abstract

}
}