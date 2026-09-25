package com.example.learnjava2026.LearnInClass;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,String> dsTuDien = new TreeMap<>();
        while (true){
            System.out.println("------------MENU------------");
            System.out.println("1. Them tu vung");
            System.out.println("2. In tu vung");
            System.out.println("3. Tra cuu tu vung");
            System.out.println("4. Cap nhat tu vung");
            System.out.println("q. Quit");
            System.out.println("----------------------------");
            String check = scanner.nextLine();
            if (check.equals("1")){
                System.out.println("Nhap tu vung tieng anh: ");
                String tuKhoaTiengAnh = scanner.nextLine();

                System.out.println("Nhap tu khoa tieng viet: ");
                String tuKhoaTiengViet = scanner.nextLine();

                dsTuDien.put(tuKhoaTiengAnh,tuKhoaTiengViet);
            }else if (check.equals("2")){
                System.out.println(dsTuDien);
            }else if (check.equals("3")){
                System.out.println("Nhap tu tieng anh can tim: ");
                String tuKhoa = scanner.nextLine();
                    if (dsTuDien.get(tuKhoa) != null){
                        System.out.println("Tu " + tuKhoa + " co nghia la: " + dsTuDien.get(tuKhoa));
                    }else {
                        System.out.println("Khong tim thay tu khoa!");
                    }
            }else if (check.equals("4")){
                System.out.println("Nhap tu tieng anh can cap nhat: ");
                String tuKhoa = scanner.nextLine();
                if (dsTuDien.get(tuKhoa) != null){
                    System.out.println(tuKhoa + " co nghia la: ");
                    String tuKhoaCanDoi = scanner.nextLine();
                    dsTuDien.replace(tuKhoa,tuKhoaCanDoi);
                    System.out.println("Tu khoa da thay doi la: " + dsTuDien.get(tuKhoa));
                }else {
                    System.out.println("Khong tim thay tu khoa!");
                }
            } else if (check.equals("q")){
                break;
            } else {
                System.out.println("Vui long chon menu");
            }
        }
    }

}
