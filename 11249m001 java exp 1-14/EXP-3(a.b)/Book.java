
import java.util.Scanner;

class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("Books starting with A:");

        for (int i = 0; i < 10; i++) {
            if (books[i].toUpperCase().startsWith("A"))
                System.out.println(books[i]);
        }

        sc.close();
    }
}