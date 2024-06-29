class kadanesalgorithm{
    long maxSubarraySum(int arr[], int n){
        // long sum=0;
        // long max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         max = Math.max(max,sum);
        //     }
        // }

        // return max;

        // Optimal Approach
        long sum=0;
        long maxi=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;


    }
}