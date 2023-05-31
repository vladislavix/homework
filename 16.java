import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Размер массива: ");

        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " числа(ел)...");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Выберите условие сортировки:\n\n\t1 - По возрастанию\n\t2 - По убыванию\n\n");

        int currentMethod = sc.nextInt();
        while (currentMethod != 1 && currentMethod != 2) {
            System.out.println("Неверное условие сортировки");

            currentMethod = sc.nextInt();
        }

        Sorting method;

        if (currentMethod == 1)
            method = (a, b) -> a > b;
        else
            method = (a, b) -> a < b;

        sort(array, method);

        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");

        sc.close();
    }

    interface Sorting {
        boolean compare(int a, int b);
    }

    private static void sort(int[] data, Sorting sort) {
        int sz = data.length;

        for (int i = 0; i < sz - 1; i++) {
            for (int j = 0; j < sz - i - 1; j++) {
                if (sort.compare(data[j], data[j + 1])) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
