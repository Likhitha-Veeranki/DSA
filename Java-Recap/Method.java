public class Method {
    static int add(int a, int b){ //a and b are parameters
        return a+b;
    }

    //method overloading :-  multiple methods can have the same name with different parameters.
    static int add(int a, int b, int c){    
        return a+b+c;
    }

    //Recursion using java methods
    static int sumup(int n){
        if(n==0){
            return 0;
        }
        else{
             return n+sumup(n-1);
        }

    }

    public static void main(String[] args){
        int result =add(4,5); //4 and 5 are arguments
        System.out.println(result);
        int result2 = add(4,5,6);
        System.out.println(result2);
        int s = sumup(6);
        System.out.println(s); 
    }
}