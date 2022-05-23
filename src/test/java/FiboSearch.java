public class FiboSearch {

    public static void main(String[] args) {
        System.out.println(fiboSearch(100));
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