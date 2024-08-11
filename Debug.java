import java.util.*;

class Solution {
    public static boolean checkeven(int [] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) return false;
        }
        return true;
    }
    public static boolean checkzero(int []nums){
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0) return false;
        }
        return true;
    }
    public static int minOperations(int[] nums) {
        int n=nums.length;
        int count=1;
        while (!checkzero(nums)){
            if(checkeven(nums)){
                for(int j=0;j<n;j++){
                    if(nums[j]%2==0)
                    nums[j]=nums[j]/2;
                }
                count++;
            }
            else{
                for(int k=0;k<n;k++){
                    if(nums[k]%2!=0) nums[k]=nums[k]-1;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums={3,2,2,4};
        System.out.println(minOperations(nums));
    }
}