package com.example.learnjava2026.LearnInClass;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap van ban: ");
        String content = scanner.nextLine();
        Map<String,Integer> arrayContent = new HashMap<>();
        String array[] = content.toLowerCase(Locale.ROOT).split("\\s+");
        for (int i = 0 ; i < array.length ; i++){
            String word = array[i];
            if (arrayContent.containsKey(word)){
                int count = arrayContent.get(word);
                arrayContent.put(word,count+1);
            }else {
                arrayContent.put(word,1);
            }
        }
        System.out.println(arrayContent);
    }
}
