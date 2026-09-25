package com.example.learnjava2026.LearnInClass;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> dsBenhNhan = new LinkedList<>();
        while (true){
            System.out.println("-------MENU------");
            System.out.println("1. Lay so");
            System.out.println("2. So tiep Theo");
            System.out.println("3. Phuc vu nguoi tiep theo");
            System.out.println("q. Quit");
            System.out.println("------------------");
            String check = scanner.nextLine();
            if (check.equals("1")){
                System.out.println("Vui long nhap ho va ten: ");
                String hoTen = scanner.nextLine();
                dsBenhNhan.add(hoTen);
                System.out.println(dsBenhNhan);
            }else if (check.equals("2")){
                if (dsBenhNhan != null){
                    System.out.println("Nguoi tiep theo la: " + dsBenhNhan.peek());
                }else {
                    System.out.println("Hien chua co ai trong hang cho!");
                }
            }else if (check.equals("3")){
                if (dsBenhNhan != null){
                    System.out.println("Xin moi benh nhan: " + dsBenhNhan.poll());
                }else {
                    System.out.println("Hien chua co ai trong hang cho!");
                }
            }else if (check.equals("q")){
                break;
            }else {
                System.out.println("Vui long nhap menu");
            }
        }
    }
}
