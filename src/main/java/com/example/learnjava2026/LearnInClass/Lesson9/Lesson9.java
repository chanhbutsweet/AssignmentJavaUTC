package com.example.learnjava2026.LearnInClass.Lesson9;

import com.example.learnjava2026.LearnInClass.Lesson2.SinhVien;
import com.example.learnjava2026.LearnInClass.Lesson8.YeuCau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> lsSV = new ArrayList<>();

        while (true){
            System.out.println("--------MENU---------");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Sua diem sinh vien");
            System.out.println("3. In danh sach yeu cau");
            System.out.println("4. Tinh diem trung binh");
            System.out.println("q. Quit");
            System.out.println("---------------------");
            String check = scanner.nextLine();

            if (check.equals("1")){
                System.out.println("Nhap ma sinh vien: ");
                String ma = scanner.nextLine();

            }else if (check.equals("2")){
            }
            else if (check.equals("3")){
            }else {
                System.out.println("Vui long chon menu!");
            }
    }
}
}

