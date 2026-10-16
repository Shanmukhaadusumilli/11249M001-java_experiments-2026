
import java.util.Scanner;

class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Both names are the same");
        else
            System.out.println("Names are different");

        sc.close();
    }
}