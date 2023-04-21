import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("ips.txt")) {
            while (true) {
                String currentInput = scanner.nextLine();

                if (currentInput.equals("ESC"))
                    break;

                if (currentInput.matches("((25[0-5]|2[0-4][0-9]|1([0-9]{2})|[0-9]{1,2})[.]){3}(25[0-5]|2[0-4][0-9]|1([0-9]{2})|[0-9]{1,2})"))
                    fw.write("Valid IP - " + currentInput + "\n");
                else
                    fw.write("Invalid IP - " + currentInput + "\n");
            }
        } catch (IOException ex){
            System.out.println(ex);
        }

        scanner.close();
    }
}
