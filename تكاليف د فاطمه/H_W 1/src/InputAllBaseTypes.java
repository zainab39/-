import java.util.Scanner;

//1-Write a short Java method, inputAllBaseTypes, that inputs a different value of each base type from
// the standard input device and prints it back to the standard output device.
public class InputAllBaseTypes {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value: ");
        boolean boolValue = scanner.nextBoolean();

        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Consume the newline character
        scanner.nextLine();

        System.out.print("Enter a char value: ");
        char charValue = scanner.nextLine().charAt(0);

        System.out.println("\nValues entered:");

        System.out.println("Boolean: " + boolValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
    }
}
