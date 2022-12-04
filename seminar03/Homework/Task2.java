package seminar03.Homework;

import java.util.ArrayList;

import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
            list.add(GetRandomNumber());
        }
        System.out.printf("Начальный список %s\n", list);
        DeleteEvenElement(list);
        System.out.printf("Список без чётных чисел %s\n", list);

    }

    public static int GetRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

    public static void DeleteEvenElement(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 2) == 0) {
                list.remove(i);
                i--;
            }
        }
    }
}
