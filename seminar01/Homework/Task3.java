// 3. Реализовать простой калькулятор (операции + - / * )
package seminar01.Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        iScanner.close();

        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (double) num1 / (double) num2;
                break;
            default:
                System.out.printf("Ошибка! Введите правильный оператор");
                return;
        }
        System.out.print("Результат:\n");
        System.out.printf("%d %c %d = %.2f", num1, operation, num2, result);
    }
}
