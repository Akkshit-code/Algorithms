import java.util.*;
class SubarraySumEqualsToK {
        public static int subarraysDivByK(int[] nums, int k) {
            int n=nums.length;
            HashMap<Integer,Integer> hm=new HashMap<>();
            int remainder_sum=0;
            int count=0;
            hm.put(0, 1);
            for(int i=0;i<n;i++){
                remainder_sum=remainder_sum+nums[i];
                int remainder=remainder_sum%k;
                if(remainder<0) remainder+=k;
                if(hm.containsKey(remainder)){
                    count+=hm.get(remainder);
                    hm.put(remainder,hm.get(remainder)+1);
                }
                else{
                    hm.put(remainder,1);
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int [] nums={4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(nums,5));
    }
}
