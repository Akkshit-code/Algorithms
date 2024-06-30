import java.util.Arrays;

public class SieveOfErasthonese {
        public static int countPrimes(int n) {
            if (n <= 2) {
                return 0;
            }

            boolean[] isPrime = new boolean[n];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i * i < n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            return count;
        }



    public static void main(String[] args) {
        int n=3;
        System.out.println(countPrimes(n));
    }
}
