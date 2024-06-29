public class Brian_kernighans_algorithm {
    public static int hammingWeight(int n) {
        //  Brian Kernighan's Algorithm
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}


//public class Nicesubarrays {
//    public static int ksubarrays(int [] nums , int k){
//
//        // Brute force approach
//        int n = nums.length;
//        int count=0;
//        int result=0;
//        for(int i=0;i<n;i++){
//            count=0;
//            for(int j=i;j<n;j++){
//                if(nums[j]%2!=0) count++;
//                if(count == k) result++;
//            }
//
//        }
//        return result;
//
//        // Sliding window approach
//        class Solution {
//            public int numberOfSubarrays(int[] nums, int k) {
//                int len=nums.length;
//                int left=0,right=0,count=0,max=0,temp=0;
//                while(right<len)
//                {
//                    if(nums[right]%2==1)
//                    {
//                        count++;
//                        temp=0;
//                    }
//
//                    while(count==k)
//                    {
//                        temp++;
//                        if(nums[left]%2==1)
//                        {
//                            count--;
//                        }
//
//                        left++;
//                    }
//                    max=max+temp;
//
//                    right++;
//                }
//                return max;
//
//            }
//        }
//
//    }
//
//}
