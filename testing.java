//i have mades changes and i will commit now 

import java.util.Scanner;

public class Main {
    public static boolean isIsoscelesTriangle(double a, double b, double c) {
        return a == b || a == c || b == c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();
        
        if (isIsoscelesTriangle(a, b, c)) {
            System.out.printf("The triangle with sides %.2f, %.2f, %.2f is an Isosceles triangle.%n", a, b, c);
        } else {
            System.out.printf("The triangle with sides %.2f, %.2f, %.2f is not an Isosceles triangle.%n", a, b, c);
        }
    }
}
