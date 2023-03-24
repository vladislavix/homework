import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double summ = 0;

        Scanner smth = new Scanner(System.in);

        System.out.print("x: ");

        double x = smth.nextDouble();

        System.out.print("i: ");

        int limit = smth.nextInt();

        for (int i = 0; i < limit; i++)
            summ += (Math.pow(-1, i) * Math.pow(x - 1, i + 1)) / (i + 1);

        System.out.println(summ);

        smth.close();
    }
}
