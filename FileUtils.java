import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUtils {
    public void stringToFile(String fileName, String input) {

        try {
            PrintWriter pWrite = new PrintWriter(fileName);
            // prepare
            pWrite.write(input);

            pWrite.close();
        } catch (Exception e) {
            System.out.println("bruh" + e);
        }

    }

    public String fileToString(String fileName) {
        String str = "";

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(fileName));

            while (buffReader.ready()) {
                int chara = buffReader.read();

                // add chara to end of str
                str += (char) chara;
            }

            buffReader.close();
        } catch (Exception e) {
            System.out.println("bruh" + e);
        }

        return str;
    }

    public static int countCharacters(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int counter = 0;
        while (reader.ready()) {
            reader.read();
            counter++;
        }
        reader.close();
        return counter;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countCharacters("tester.java"));
    }
}