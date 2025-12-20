import java.util.Arrays;
public class ArrayMethods{
    public static void main(String [] args){
        int[] num = {40,20,10,50,70,5};
        System.out.println("initial array is : "+num); //it prints the memory reference of the array object
        System.out.println("initial array is : "+Arrays.toString(num)); //toString method is used to print elements
        System.out.println("array length is : "+num.length);
        Arrays.sort(num); //sorting
        System.out.println("sorted array is : "+Arrays.toString(num));
        System.out.println("binary search for 40 gives : "+Arrays.binarySearch(num,40)); //searching

        //copying and resizeing
        int[] num2=Arrays.copyOf(num,3);
        int[] num3 =Arrays.copyOfRange(num,2,5);
        System.out.println("copying to certain length(3) [num2] : "+Arrays.toString(num2));
        System.out.println("copying certain range of indeces(2,5) [num3] : "+Arrays.toString(num3));
        System.out.println("checking equality of arrays[num2 and num3] : "+Arrays.equals(num2,num3));

        //modification
        Arrays.fill(num2,0);
        System.out.println("filling the array num2 with 0 : " +Arrays.toString(num2));
        Arrays.setAll(num3,i -> (num3[i]*2)); //here i refers to the indeces
        System.out.println("Setting or modifying values of num3 with set all method : "+Arrays.toString(num3));

    }
}

/*
Note :- 
    in java an Array can be printed in the following ways only.
          - using toString() method
          - using for loop
          - using for each loop

 */