import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        String fileName = "document.txt";

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Welcome to My Text Editor.\n");
            fw.write("This content is saved using FileWriter.\n");
            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try (FileReader fr = new FileReader(fileName)) {
            System.out.println("\n--- File Content ---");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}