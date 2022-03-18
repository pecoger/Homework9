package Task3;

import java.util.Arrays;
import java.util.Random;

public class RandoNumberGenerator {
    public static void main(String[] args) {

        fillArrayWithRandomNumbers(5);
    }

    public static void fillArrayWithRandomNumbers(int length) {
        int [] myArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(0,20);
        }
        System.out.println("This is your array: " + Arrays.toString(myArray));
    }
}
