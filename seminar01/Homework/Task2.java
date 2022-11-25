// 2. Вывести все простые числа от 1 до 1000
package seminar01.Homework;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            boolean isprime = true;

            for (int j = 2; j <= i / j; j++)
                if ((i % j) == 0)
                    isprime = false;
            if (isprime)
                System.out.print(i + " ");
        }
    }
}
