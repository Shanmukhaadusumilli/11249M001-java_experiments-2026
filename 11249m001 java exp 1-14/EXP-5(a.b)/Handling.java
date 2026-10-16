import java.io.*;
import java.util.*;

public class Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            String input = sc.nextLine();

            int age = Integer.parseInt(input);

            System.out.println("Age: " + age);

            int result = 100 / 0;
            System.out.println(result);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: Invalid age. Please enter a number.");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        }

        sc.close();
    }
}