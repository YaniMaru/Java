package seminar05.Homework;

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Map<String, List<String>> db = new HashMap<>();

        while (true) {
            System.out.println(
                    "Введите команду из списка: 1 - найти контакт, 2 - добавить контакт, 3 - показать всю телефонную книгу");
            String comands = scanner();
            switch (comands) {
                case "1":
                    find(db);
                    break;
                case "2":
                    add(db);
                    break;
                case "3":
                    allBook(db);
                    break;
                default:
                    System.out.println("Не корректный ввод!");
                    break;
            }
        }

    }

    public static String scanner() {
        Scanner sc = new Scanner(System.in, "ibm866");
        String scan = sc.nextLine();
        return scan;
    }

    public static void find(Map<String, List<String>> db) {
        System.out.println("Введите ФИО: ");
        String name = scanner();
        System.out.println(db.get(name));
    }

    public static void allBook(Map<String, List<String>> db) {
        System.out.println("Телефонная книга: ");
        for (String phone : db.keySet()) {
            System.out.printf("ФИО %s телефон(ы) %s\n", phone, db.get(phone));
        }
    }

    public static Map<String, List<String>> add(Map<String, List<String>> db) {
        System.out.println("Для остановки добавления номеров введите '!'");
        System.out.println("Введите ФИО: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String phon = scanner();
            if (phon.equals("!")) {
                break;
            } else {
                number.add(phon);
            }
        }
        db.put(name, number);

        return db;
    }
}
