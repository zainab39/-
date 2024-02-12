//5-Write a short Java method that takes an integer n and returns
// the sum of all positive integers less than or equal to n.

public class SumOfPositiveIntegers {
    public static void main(String[] args) {
        int i = 5;
        int result = sumOfPositiveIntegers(i);
        System.out.println(result);
    }

    public static int sumOfPositiveIntegers(int i) {
        int sum = 0;
        for (int z = 1; z <= i; z++) {
            sum += z;
        }
        return sum;
    }
}