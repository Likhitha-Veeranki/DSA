public class RecursionPatterns{
    static int sum(int n) {          //Functional
        if (n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
    static void sum2(int n, int total) {          //Parametrised
        if (n == 0) {
            System.out.println(total);
            return;
        }
        sum2(n - 1, total + n);
    }

    static void reverse(int[] arr, int left, int right) {   //Backtracking
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args){
        int[] arra = {1,2,3,4,5,6};
        System.out.println("Reversing of array :");
        reverse(arra,0,arra.length-1);
        for(int i : arra){
            System.out.print(i);
        }
        System.out.println();
        System.out.print("Sum of numbers upto 10 :");
        sum2(10,0);
        System.out.print("Sum of numbers upto 20 :"+sum(20));

    }
}

/*
Recursion Patterns
    - functional Recursion     ->    Return value form.
    - Parametrised Recursion   ->    Carry answer in parameter. 
    - Backtracking             ->    Reverse array using recursion:
*/