package seminar02.Homework;

import java.io.FileWriter;
import java.util.Arrays;
// 2. 
// Реализуйте алгоритм сортировки пузырьком числового массива, результат 
// после каждой итерации запишите в лог-файл.

public class Task02 {
    public static void main(String args[]) {
        int[] arr = RandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }

    public static int[] RandomArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        return array;
    }

    public static int[] BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
            WriteToFile(array);
        }

        return array;
    }

    public static void WriteToFile(int[] array) {
        try (FileWriter f = new FileWriter("log.txt", true)) {
            f.write(Arrays.toString(array));
            f.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
