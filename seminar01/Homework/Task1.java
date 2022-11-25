// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//    n! (произведение чисел от 1 до n)
package seminar01.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;
        }

        System.out.printf("Сумма чисел от 1 до %d: %d.\n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d.\n", n, mult);

    }
}
