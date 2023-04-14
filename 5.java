import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Размер массива: ");

        int sz = in.nextInt();
        int[] toSort = new int[sz];

        for (int i = 0; i < sz; i++)
            toSort[i] = in.nextInt();

        for (int i = 0; i < sz - 1; i++) {
            for (int j = 0; j < sz - i - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    int temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < sz; i++)
            System.out.print(toSort[i] + " ");

        in.close();
    }
}
