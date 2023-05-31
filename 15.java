import java.io.*;
import java.util.Scanner;

class Expr implements Serializable {
    private double result;

    Expr (double x) {
        result = x - Math.sin(x);
    }

    double getResult () {
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x: ");

        Expr ex = new Expr(sc.nextDouble());

        System.out.println("Expression result: " + ex.getResult());

        while (true) {
            String line = sc.nextLine();

            if (line.equals("exit"))
                break;

            if (line.equals("save")) {
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("saved.txt"))) {
                    out.writeObject(ex);
                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    System.out.println("Successfully saved object.");
                }
            } else if (line.equals("load")) {
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("saved.txt"))) {
                    Expr loadedEx = (Expr)in.readObject();

                    System.out.println("Loaded object. Expression result: " + loadedEx.getResult() + ".");
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }

        sc.close();
    }
}
