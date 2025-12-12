
//two pointer methods of solving for certain problems. consider two programs for single problem.

 // Question:- Find two numbers in a sorted array that sum to a target.


//(general way of solving)

 class Solution2 {                                //this solution provides the time complexity of O(n^2)
    public void twoSum(int[] nums, int target) {
    int flag=0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                System.out.println("found at indexes "+i +" and "+j);
                flag=1;
                }
            }
        }
                if(flag==0){
        System.out.println("no such members found");
        }
    }
}



//using two pointers to get solution

/*

 class Solution {                //this solution provides the time complexity of O(n)
    public void twoSum(int[] nums, int target) {
        int left=0,flag=0;
        int right=nums.length-1;
        while(left<right){
         int sum=nums[left]+nums[right];
         if(sum==target){
         System.out.println("found at indexes "+left +" and "+right);
         flag=1;
         break;
         }
         else if (sum<target){
         left++;
         }
         else{
         right--;
         }
        }
        if(flag==0){
        System.out.println("no such members found");
        }
    }
}

*/

public class TwoPointer{
    public static void main(String[] args){
       // Solution sol = new Solution();
        Solution2 sol = new Solution2();
        int[] a={2,3,4,5,6};
        sol.twoSum(a,7);
    }
}

