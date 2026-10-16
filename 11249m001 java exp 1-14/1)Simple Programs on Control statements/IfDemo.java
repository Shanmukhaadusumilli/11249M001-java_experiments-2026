
import java.util.Scanner;

class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive number");

        sc.close();
    }
}