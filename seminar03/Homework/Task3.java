package seminar03.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(GetRandomNumber());
        }
        System.out.printf("Начальный список %s\n", list);
        System.out.printf("Максимальное значение %s\n", Collections.max(list));
        System.out.printf("Минимальное значение %s\n", Collections.min(list));
        System.out.printf("Среднее значение %.2f\n", Average(list));
    }

    public static int GetRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

    public static double Average(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}
