package com.example.learnjava2026.LearnInClass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lesson3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Nhap so dien thoai (q: Quit) : ");
            String sdt = scanner.nextLine();
            if (sdt.equals("q")){
                break;
            }
            hashSet.add(sdt);
        }
        System.out.println(hashSet.toString());
    }
}
