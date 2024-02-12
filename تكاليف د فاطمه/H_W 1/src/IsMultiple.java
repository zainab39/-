//3-Write a short Java method, isMultiple, that takes two long values, n and m,
// and returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
public class IsMultiple {
    public static void main(String[] args) {
        long z = 20;
        long i = 5;
        boolean result = isMultiple(z, i);
        System.out.println(result);
    }

    public static boolean isMultiple(long z, long i) {
        if (i == 0) {
            return false;
        }

        return z % i == 0;
    }
}

