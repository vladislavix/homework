import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("program.txt")) {
            StringBuilder sb = new StringBuilder();

            int charCode = -1;
            while((charCode = fr.read()) != -1)
                sb.append(Character.toChars(charCode));

            String program = sb.toString();

            String replaced = program.replaceAll("/\\*(\\w|\\s|\\n)+\\*/", "").replaceAll("/{2}(\\w|\\s)+\\n", "\n");

            try (FileWriter fw = new FileWriter("program_no_comments.txt")) {
                fw.write(replaced);
            } catch(IOException ex) {
                System.out.println(ex);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
