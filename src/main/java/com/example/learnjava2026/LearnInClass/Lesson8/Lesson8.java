package com.example.learnjava2026.LearnInClass.Lesson8;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        PriorityQueue<YeuCau> dsYeuCau = new PriorityQueue<>(Comparator.comparingInt(YeuCau::getMucDoUuTien));
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("--------MENU---------");
            System.out.println("1. Them yeu cau");
            System.out.println("2. Xu ly yeu cau");
            System.out.println("3. In danh sach yeu cau");
            System.out.println("---------------------");
            String check = scanner.nextLine();

            if (check.equals("1")){
                System.out.println("Nhap id yeu cau: ");
                String id = scanner.nextLine();

                System.out.println("Nhap mo ta yeu cau: ");
                String moTa = scanner.nextLine();

                System.out.println("Nhap muc do uu tien: ");
                int mucDoUuTien = scanner.nextInt();
                scanner.nextLine();

                YeuCau yc = new YeuCau(id,moTa,mucDoUuTien);
                dsYeuCau.add(yc);
            }else if (check.equals("2")){
                dsYeuCau.poll();
                System.out.println("yeu cau da duoc su ly");
            }
            else if (check.equals("3")){
                System.out.println(dsYeuCau);
            }else {
                System.out.println("Vui long chon menu!");
            }
        }
    }
}
