import java.io.*;

public class FitnessProfile {
    public static void main(String[] args) {
        String fileName = "profile.txt";
        String profile = "Name: Arun\nAge: 25\nWeight: 70 kg\nHeight: 175 cm\nGoal: Build muscle\n";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(profile.getBytes());
            System.out.println("Profile saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("\n--- User Profile ---");
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}