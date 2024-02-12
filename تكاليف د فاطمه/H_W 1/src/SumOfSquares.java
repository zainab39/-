//7-Write a short Java method that takes an integer n and returns
// the sum of the squares of all positive integers less than or equal to n.
public class SumOfSquares {
    public static void main(String[] args) {
        int n = 4;
        int result = sumOfSquares(n);
        System.out.println(result);
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int z = 1; z <= n; z++) {
            sum += z * z;
        }
        return sum;
    }
}
