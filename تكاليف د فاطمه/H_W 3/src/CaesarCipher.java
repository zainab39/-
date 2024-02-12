//Explain the changes that would have to be made to the program of Code Fragment
//        3.8 so that it could perform the Caesar cipher for messages that are written
//        in an alphabet-based language other than English, such as Greek, Russian, or Hebrew.
public class CaesarCipher {
        public static void main(String[] args) {
            String message = "Γειά σου Κόσμε!"; // Greek message
            int shift = 5; // Shift amount for the Greek alphabet

            String encryptedMessage = encrypt(message, shift);
            System.out.println("Encrypted message: " + encryptedMessage);

            String decryptedMessage = decrypt(encryptedMessage, shift);
            System.out.println("Decrypted message: " + decryptedMessage);
        }

        public static String encrypt(String message, int shift) {
            StringBuilder encrypted = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                if (Character.isLetter(ch)) {
                    char encryptedChar = (char) ((ch + shift - 'Α') % 26 + 'Α');
                    encrypted.append(encryptedChar);
                } else {
                    encrypted.append(ch);
                }
            }
            return encrypted.toString();
        }

        public static String decrypt(String message, int shift) {
            StringBuilder decrypted = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                if (Character.isLetter(ch)) {
                    char decryptedChar = (char) ((ch - shift - 'Α' + 26) % 26 + 'Α');
                    decrypted.append(decryptedChar);
                } else {
                    decrypted.append(ch);
                }
            }
            return decrypted.toString();
        }
    }