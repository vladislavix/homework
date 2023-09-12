import java.util.Scanner;

class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
    public double calculate(double x, double y) {
        return 2 * x + 3 / y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (y == 0){
            System.out.println("y == 0");
            return;
        }

        Singleton instance = Singleton.getInstance();

        System.out.println(instance.calculate(x, y));
    }
}
