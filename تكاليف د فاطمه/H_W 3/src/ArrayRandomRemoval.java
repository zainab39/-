//ava method that repeatedly selects and removes a random entry from an array until the array
// holds no more entries.
import java.util.Random;

    public class ArrayRandomRemoval {
        public static void main(String[] args) {
            Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            shuffleArray(array);
        }

        public static void shuffleArray(Integer[] array) {
            Random random = new Random();
            int n = array.length;

            while (n > 0) {
                int randomIndex = random.nextInt(n);
                n--;

                int temp = array[n];
                array[n] = array[randomIndex];
                array[randomIndex] = temp;

                System.out.print(array[n] + " ");
            }
        }
    }
