import java.util.Arrays;

public class FiboSearch {

    public static void main(String[] args) {
        int n = 100;
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);

        System.out.println(fiboWithMemo(n, memo));
        System.out.println(fiboSearch(100));
    }

    private static long fiboWithMemo(int n, long[] memo) {
        if (n <= 1){
            return n;
        }
        else if (memo[n] != -1){
            return memo[n];
        }
        long result = fiboWithMemo(n - 1, memo) + fiboWithMemo(n - 2, memo);
        memo[n] = result;
        return result;
    }

    private static long fiboSearch(int number) {
        long[] array = new long[number + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= number; i++)
            array[i] = array[i - 1] + array[i - 2];

        return array[number];
    }
}