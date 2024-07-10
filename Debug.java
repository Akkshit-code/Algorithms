import java.util.*;

class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> Biglist=new ArrayList<>();
        long sum=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x=j+1;
                int y=n-1;
                while(x<y){
                    sum=0;
                    sum+=(nums[i]+nums[j]+nums[x]+nums[y]);
                    if(sum==target){
                        s.add(Arrays.asList(nums[i],nums[j],nums[x],nums[y]));
                        x++;
                        y--;
                    }
                    else if(sum>target) y--;
                    else x++;
                }
            }
        }
        Biglist.addAll(s);
        return Biglist;
    }

    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> result = fourSum(nums, target);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}