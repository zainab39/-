//6-Write a short Java method that takes an integer n and
// returns the sum of all the odd positive integers less than or equal to n
public class SumOfOddPositiveIntegers {
    public static void main(String[] args) {
        int n = 10;
        int result = sumOfOddPositiveIntegers(n);
        System.out.println(result);
    }

    public static int sumOfOddPositiveIntegers(int n) {
        int sum = 0;
        for (int z = 1; z <= n; z += 2) {
            sum += z;
        }
        return sum;
    }
}
