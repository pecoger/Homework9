package Task1;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        findHighestNumber();
    }
    public static int findHighestNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers.");

        System.out.println("Please enter the first number.");
        int x = scanner.nextInt();;

        System.out.println("Please enter the second number.");
        int y = scanner.nextInt();

        System.out.println("Please enter the third number.");
        int z = scanner.nextInt();

        int highestNumber = Math.max(x, Math.max(y, z));

        System.out.println("The highest number is " + highestNumber + ".");
        return highestNumber;
    }
}
