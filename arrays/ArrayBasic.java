public class ArrayBasic{
    public static void main(String[] args){
        //types of array declarations in java
        //int[] arr;
        //int arr[];  //just instance was created
        // int[] arr = new int[3] //(array declaration with size and intialized to 0)
        int[] arr ={1,2,3,4,6};    //array declaration with initialisation
        int [][] ndarr = {{1,2,3},{4,5,6}};
        for (int i =0 ;i<arr.length;i++){             //traversing arrays
            if(arr[i]==6){
                arr[i]=5;          //modification or updating of elements
            }
            System.out.println(arr[i]);      //accessing and printing elements
        }


        for(int[] i: ndarr){               //traversing multi dimensional array
            for(int j :i){
                System.out.println(j);  
            }
        }


        int max =arr[0];
        for(int i : arr){             //finding maximum of array (min also have same program with changing comparisional operator)
            if(i>max){
                max=i;
            }
        }
         System.out.println(max); 

         int search =6 ;
         int position =-1;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                position =i;
                break;
            }
         }
         if(position<0){
            System.out.println("6 is not present in the array");
         }
         else{
            System.out.println("6 is present in the array at index = "+position);
         }
    }
}

