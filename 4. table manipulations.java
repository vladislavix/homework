import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите " + n + " элементов массива:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double avg = (double) sum / n;
        double result = min + avg;

        System.out.println("Сумма минимального элемента и среднего арифметического массива: " + result);

        scanner.close();
    }
}
