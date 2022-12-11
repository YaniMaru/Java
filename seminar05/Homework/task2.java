package seminar05.Homework;

// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений. Отсортировать по убыванию популярности.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class task2 {

    public static void main(String[] args) throws IOException {
        String fileName = "file.txt";
        String employees = readUsingFiles(fileName);
        System.out.println(Sortdb(ReadFromFile(employees)));

    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static Map<String, Integer> ReadFromFile(String str) {
        Map<String, Integer> db = new HashMap<>();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i += 2) {
            if (db.containsKey(arr[i])) {
                db.replace(arr[i], db.get(arr[i]) + 1);
            } else {
                db.put(arr[i], 1);
            }
        }
        return db;

    }

    public static Map<String, Integer> Sortdb(Map<String, Integer> db) throws IOException {
        Map<String, Integer> sortdb = new LinkedHashMap<>();
        int max = 1;
        for (int value : db.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> x : db.entrySet()) {
                String key = x.getKey();
                if (db.get(key) == i) {
                    sortdb.put(key, db.get(key));
                }
            }
        }
        return sortdb;

    }

}