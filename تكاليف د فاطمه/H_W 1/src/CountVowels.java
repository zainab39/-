//8-Write a short Java method that counts the number of vowels in a given character string.
public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int result = countVowels(str);
        System.out.println(result);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

        for (int z = 0; z < str.length(); z++) {
            char c = str.charAt(z);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}