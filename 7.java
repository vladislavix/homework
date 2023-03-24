import java.util.Scanner;

class ExpressionCalculator {
    public static double calculateExpression1(double x) {
        return 3 * x + 5;
    }

    public static double calculateExpression2(double a, double b) {
        double diff = (a - b);

        if (diff == 0)
            return -1;

        return (a + b) / (a - b);
    }

    public static double calculateExpression3(double a, double x, double b) {
        if (b == 0)
            return -1;

        double ax = a * x;
        return ax / b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ExpressionCalculator calculator = new ExpressionCalculator();
        ExpressionCalculator calculator1 = new ExpressionCalculator();
        ExpressionCalculator calculator2 = new ExpressionCalculator();

        double x = in.nextDouble();
        double y1 = calculator.calculateExpression1(x);
        System.out.println("y1 = " + y1);

        double a = 3.0;
        double b = 2.0;
        double y2 = calculator1.calculateExpression2(a, b);
        System.out.println("y2 = " + y2);

        double y3 = calculator2.calculateExpression3(a, x, b);
        System.out.println("y3 = " + y3);

        in.close();
    }
}
