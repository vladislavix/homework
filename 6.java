import java.util.Scanner;

public class Main {
    public static void combSort(int[] arr) {
        int gap = arr.length;
        double shrink = 1.3;
        boolean sorted = false;
        while (!sorted) {
            gap = (int) Math.floor(gap / shrink);
            if (gap <= 1) {
                gap = 1;
                sorted = true;
            }
            int i = 0;
            while (i + gap < arr.length) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    sorted = false;
                }
                i++;
            }
        }
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        combSort(arr);

        System.out.println("Отсортированный массив: ");

        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        scanner.close();
    }
}
