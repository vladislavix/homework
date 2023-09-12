import java.util.Scanner;

interface Operationable<T> {
    T add(T a, T b);
    T sub(T a, T b);
    T div(T a, T b) throws Exception;
    T mul(T a, T b);
}

class IntegerOperations implements Operationable<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer div(Integer a, Integer b) throws Exception {
        if (b == 0)
            throw new Exception("b == 0");

        return a / b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a * b;
    }
}

class DoubleOperations implements Operationable<Double> {

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double div(Double a, Double b) throws Exception {
        if (b == 0)
            throw new Exception("b == 0");

        return a / b;
    }

    @Override
    public Double mul(Double a, Double b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите тип данных (1 - Integer, 2 - Double): ");
        int dataTypeChoice = sc.nextInt();

        Operationable<?> calculator;
        if (dataTypeChoice == 1) {
            calculator = new IntegerOperations();
        } else if (dataTypeChoice == 2) {
            calculator = new DoubleOperations();
        } else {
            System.out.println("Неподдерживаемый тип данных.");
            return;
        }

        System.out.println("Введите первое число:");
        Double operand1 = sc.nextDouble();

        System.out.println("Введите второе число:");
        Double operand2 = sc.nextDouble();

        System.out.println("Выберите операцию (1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление):");
        int operationChoice = sc.nextInt();

        switch (operationChoice) {
            case 1:
                System.out.println("Результат: " + calculator.add(operand1, operand2));
                break;
            case 2:
                System.out.println("Результат: " + calculator.sub(operand1, operand2));
                break;
            case 3:
                System.out.println("Результат: " + calculator.mul(operand1, operand2));
                break;
            case 4:
                System.out.println("Результат: " + calculator.div(operand1, operand2));
                break;
            default:
                System.out.println("Неподдерживаемая операция.");
        }

        sc.close();
    }
}
