import java.io.*;
import java.util.*;

public class ExceptioN {
    public static void main(String[] args) {
        String[] trainCodes = {"TR101", "TR102", "TR103", "TR104", "TR105"};

        try {
            System.out.println("Train Code: " + trainCodes[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index is out of bounds.");
        }
    }
}