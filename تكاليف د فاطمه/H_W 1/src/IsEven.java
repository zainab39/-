//4-Write a short Java method, isEven, that takes an int i and returns true if and only if i is even.
// Your method cannot use the multiplication, modulus, or division operators, however.
public class IsEven {
    public static void main(String[] args) {
        int z = 6;
        boolean result = isEven(z);
        System.out.println(result);
    }

    public static boolean isEven(int z) {
        return (z & 1) == 0;
    }
}

