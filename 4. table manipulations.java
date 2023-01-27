import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner smth = new Scanner(System.in);

        System.out.print("n: ");

        int n = smth.nextInt();
        int[] nums = new int[n];

        int summ = 0, min = 0x7FFFFFFF;
        for (int i = 0; i < n; i++) {
            System.out.print(Integer.toString(i) + ": ");

            nums[i] = smth.nextInt();

            summ += nums[i];
            min = Integer.min(min, nums[i]);
        }

        int avg = summ / n;
        System.out.printf("Минимальное вхождение: %d, среднее арифметическое: %d\nРезультат: %d", min, avg, min + avg);

        smth.close();
    }
}
