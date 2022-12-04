package seminar03.Homework;

import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием
public class Task1 {
    public static void main(String[] args) {
        int[] arr = RandomArray();
        System.out.printf("Исходный массив %s\n", Arrays.toString(arr));

        MergeSort(arr, arr.length);
        System.out.printf("Сортированный массив %s\n", Arrays.toString(arr));

    }

    public static int[] RandomArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        return array;
    }

    public static void MergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];

        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        MergeSort(l, mid);
        MergeSort(r, n - mid);
        Merge(arr, l, r, mid, n - mid);

    }

    public static void Merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}