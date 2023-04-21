import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String currentInput = scanner.nextLine();

            if (currentInput.equals("ESC"))
                break;

            if (currentInput.matches("((25[0-5]|2[0-4][0-9]|1([0-9]{2})|[0-9]{1,2})[.]){3}(25[0-5]|2[0-4][0-9]|1([0-9]{2})|[0-9]{1,2})"))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }

        scanner.close();
    }
}
