package Task2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        System.out.println("Please enter side of the triangle.");
        triangle1.setSideA(scanner.nextInt());

        System.out.println("Please enter side of the triangle.");
        triangle1.setSideB(scanner.nextInt());

        System.out.println("Please enter the angle between the two sides of the triangle.");
        triangle1.setAngle(scanner.nextInt());

        triangle1.findTriangleAreaByTwoSidesAndAngle();
    }
}
