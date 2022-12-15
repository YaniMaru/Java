package seminar06.Homework;

import java.util.HashSet;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1, "Huawei ", 16, 512, "Windows 11", 15, "black", 63000);
        Notebook notebook2 = new Notebook(2, "MSI", 32, 2000, "Windows 11", 17, "silver", 120000);
        Notebook notebook3 = new Notebook(3, "ASUS", 16, 512, "Windows 11", 15, "black", 28000);
        Notebook notebook4 = new Notebook(4, "Honor", 16, 1000, "Windows 11", 16, "grey", 54000);
        Notebook notebook5 = new Notebook(5, "Apple", 16, 512, "macOS", 16, "grey", 129000);
        Notebook notebook6 = new Notebook(6, "ASUS", 32, 2000, "Windows 11", 14, "black", 90500);

        HashSet<Notebook> noteSet = new HashSet<Notebook>();
        noteSet.add(notebook1);
        noteSet.add(notebook2);
        noteSet.add(notebook3);
        noteSet.add(notebook4);
        noteSet.add(notebook5);
        noteSet.add(notebook6);

        for (Object elem : noteSet) {
            System.out.println(elem);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "По какому критерию вы хотите произвести отбор:\n" +
                        "1 - цена\n2 - объем оперативной памяти\n3 - объем жесткого диска\n4 - диагональ дисплея");

        int search = sc.nextInt();
        System.out.println("задайте диапазон поиска(введите 2 цифры через пробел)");
        int min = sc.nextInt();
        int max = sc.nextInt();

        boolean flag = false;

        if (search == 1) {
            for (Notebook elem : noteSet) {
                if (elem.getPrice() >= min && elem.getPrice() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (search == 2) {
            for (Notebook elem : noteSet) {
                if (elem.getRam() >= min && elem.getRam() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }

        } else if (search == 3) {
            for (Notebook elem : noteSet) {
                if (elem.getHdd() >= min && elem.getHdd() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (search == 4) {
            for (Notebook elem : noteSet) {
                if (elem.getDiagonal() >= min && elem.getDiagonal() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("По введенным критериям ничего не найдено!");

        }
        sc.close();
    }

}