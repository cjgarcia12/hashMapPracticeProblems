package org.example;

import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String, String> hashmap) {
        hashmap.forEach((key, value) -> System.out.println(key));
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        hashmap.forEach((key, value) -> {
            if (key.contains(text)) {
                System.out.println(key);
            }
        });
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        hashmap.forEach((key, value) -> {
            if (key.contains(text)) {
                System.out.println(value);
            }
        });
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
