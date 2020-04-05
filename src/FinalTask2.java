import java.util.Scanner;

public class FinalTask2 {
// Метод сортировки Шелла
    public static void shellSort(int[] arr) {
        int j;
        for (int h = arr.length / 2; h > 0; h /= 2) {
            for (int i = h; i < arr.length; i++) {
                int temp = arr[i];
                for (j = i; j >= h && arr[j - h] > temp; j -= h) {
                    arr[j] = arr[j - h];
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Введите %d-е число: ", (i + 1));
            int enteredNumber = scan.nextInt();
            array[i] = enteredNumber;
        }
        shellSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i : array) {
            System.out.println(i);
        }
        scan.close();
    }
}