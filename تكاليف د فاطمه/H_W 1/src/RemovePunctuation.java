//9-Write a short Java method that uses a StringBuilder instance to remove all the punctuation from
// a string s storing a sentence, for example, transforming the string "Let’s try, Mike!" to "Lets try Mike".
public class RemovePunctuation {
    public static void main(String[] args) {
        String s = "Let’s try, Mike!";
        String result = removePunctuation(s);
        System.out.println(result);
    }

    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();

        for (int z = 0; z < s.length(); z++) {
            char c = s.charAt(z);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}