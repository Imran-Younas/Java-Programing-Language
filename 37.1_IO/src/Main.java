import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public void writingFile() {
        try {
            FileWriter writer = new FileWriter("Intro.txt");
            writer.write("Hello, I'm Imran Younas");
            writer.close();
            System.out.println("File Written Successfully");
        } catch (IOException e) {
            System.out.println("Error Occurred while writing.");
        }
    }

    void ReadFile() {
        try {
            File file = new File("Intro.txt");
            Scanner reader = new Scanner(file);

            System.out.println("File content:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error Occurred while reading.");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.writingFile();
        obj.ReadFile();
    }
}
