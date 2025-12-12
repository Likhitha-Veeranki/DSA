//sliding window is an approach used to decrease time complexity for solving certain problems


//consider the given question 
// Question: Given an array of integers and a number k, find the maximum sum of any contiguous subarray of size k.


/*
class SWsolution{          // general approach to solve with time complexity of O(n^2)
    public int calculation(int[] arr,int k){
        int max=0;
        for(int i=0;i<(arr.length-k);i++){
            int sum =0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}


*/

class SWsolution2{          // sliding window approach to solve with time complexity of O(n)
    public int calculation(int[] arr,int k){
        int max=0;
        int ws=0;
        for(int i=0;i<k;i++){
            ws+=arr[i];
        }
        max=ws;
        for(int i=k;i<arr.length;i++){
            ws=ws-arr[i-k];
            ws+=arr[i];
            max=Math.max(ws,max);
        }
        return max;
    }
}










public class SlidingWindow{
    public static void main(String[] args){
        SWsolution2 obj = new SWsolution2();
        int[] a= {2, 1, 5, 1, 3, 2};
        int s= 3;
        System.out.println(obj.calculation(a,s));  
    }
}