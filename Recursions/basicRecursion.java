public class basicRecursion{
    static void functionName(int n) {
        if (n == 0) {   // Base case
            return;
        }

        functionName(n - 1);  // Recursive call
    }

    static void NumbersInReverse(int n) {   //Tail Recursion
        if (n == 0) {   
            return;
        }
        System.out.println(n);
        NumbersInReverse(n - 1);  
    } 
    static int factorial(int n) {    //linear Recursion
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
    static int fabinoci(int n){      //Tree Recursion
        if(n<=1){
            return n;
        }
        return fabinoci(n-1) + fabinoci(n-2);
    }



    public static void main(String[] args){
        System.out.println("Reverse order of numbers:");
        NumbersInReverse(10);
        System.out.println("fabinoci number (8th term):");
        System.out.println(fabinoci(8));
        System.out.println("Reversing of an array:");
         System.out.println("factorial of 5 :"+factorial(5));
    }
}

/* Types of Recurions 
    - Linear Recursion -> function calls itself once
    - Tree Rrcursion   -> function itself multiple times
    - Tail Recursion   -> Recursive call is the last operation of the function
*/
