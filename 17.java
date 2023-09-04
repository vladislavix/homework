import java.util.Scanner;

class Calculator<T extends Number> {
    public T add(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }

    public T subtract(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Long.valueOf(num1.longValue() - num2.longValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }

    public T multiply(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }

    public T divide(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Неверный тип данных");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите выражение: ");

        String input = sc.nextLine();

        String[] parts = input.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Неверный формат ввода. Используйте пример: число оператор число ( 2 + 2 )");
            return;
        }

        try {
            String operator = parts[1];

            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[2]);

            Calculator calc = new Calculator<Double>();
            if (num1 != (int)num1 && num2 != (int)num2)
                calc = new Calculator<Integer>();

            Number result = 0;
            switch (operator) {
                case "+":
                    result = calc.add(num1, num2);
                    break;
                case "-":
                    result = calc.subtract(num1, num2);
                    break;
                case "*":
                    result = calc.multiply(num1, num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Деление на 0");
                        return;
                    }

                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("Неподдерживаемый оператор: " + operator);
                    return;
            }

            System.out.println("Результат: " + result);
        } catch (Exception e) {
           
        }

        sc.close();
    }
}







