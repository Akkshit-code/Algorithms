public class prefixsum_2D {
    public static int[][] computePrefixSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] prefixSum = new int[n][m];

        // Initialize the first element
        prefixSum[0][0] = arr[0][0];

        // Initialize the first row
        for (int j = 1; j < m; j++) {
            prefixSum[0][j] = prefixSum[0][j - 1] + arr[0][j];
        }

        // Initialize the first column
        for (int i = 1; i < n; i++) {
            prefixSum[i][0] = prefixSum[i - 1][0] + arr[i][0];
        }

        // Calculate the prefix sum for the rest of the array
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1] + arr[i][j];
            }
        }

        return prefixSum;
    }

    public static int prefixSum2DRange(int[][] prefixSum, int x1, int y1, int x2, int y2) {
        // Adjust indices to be 0-based
        x1--;
        y1--;
        x2--;
        y2--;

        // Calculate the sum of elements in the given range
        int total = prefixSum[x2][y2];

        if (x1 > 0) {
            total -= prefixSum[x1 - 1][y2];
        }

        if (y1 > 0) {
            total -= prefixSum[x2][y1 - 1];
        }

        if (x1 > 0 && y1 > 0) {
            total += prefixSum[x1 - 1][y1 - 1];
        }

        return total;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] prefixSum = computePrefixSum(arr);

        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;

        int result = prefixSum2DRange(prefixSum, x1, y1, x2, y2);
        System.out.println("Sum of elements in range (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") is: " + result);
    }
}
