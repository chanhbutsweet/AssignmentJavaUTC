package com.example.learnjava2026.LearnInClass.Lesson9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> lsSV = new ArrayList<>();
        Map<String,Double> listDiem = new HashMap<>();

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
                System.out.println("Nhap ten sinh vien: ");
                String ten = scanner.nextLine();
                System.out.println("so luong dau diem cua sinh vien la: ");
                int n = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0 ; i < n ; i++){
                    System.out.println("Nhap ten mon hoc thu "+ (i+1) +": ");
                    String tenMonHoc = scanner.nextLine();
                    System.out.println("Nhap diem mon "+ tenMonHoc + ": ");
                    double diem = scanner.nextDouble();
                    scanner.nextLine();
                    listDiem.put(tenMonHoc,diem);
                }
                lsSV.add(new Student(ma,ten,listDiem));

            }else if (check.equals("2")){
                System.out.println("Nhap ma sinh vien muon sua diem: ");
                String ma = scanner.nextLine();
                for (int i = 0 ; i < lsSV.size() ; i ++){
                    if (lsSV.get(i).getMa().equals(ma)){
                        System.out.println("nhap mon muon sua diem: ");
                        String monHoc = scanner.nextLine();
                        if (lsSV.get(i).getDiemCacMon().containsKey(monHoc)){
                            System.out.println("Nhap diem muon sua: ");
                            double diem = scanner.nextDouble();
                            scanner.nextLine();
                            lsSV.get(i).getDiemCacMon().replace(monHoc,diem);
                            break;
                        }else {
                            System.out.println("mon hoc khong ton tai");
                        }
                    }
                }
            }
            else if (check.equals("3")){
                System.out.println(lsSV);
            }else if (check.equals("4")){
                System.out.println("Nhap ma sinh vien muon tinh diem trung binh: ");
                String ma = scanner.nextLine();
                for (Student s: lsSV) {
                    if (s.getMa().equals(ma)) {
                        double tongDiem = 0;
                        for (Double diem : s.getDiemCacMon().values()) {
                            if (diem != null) {
                                tongDiem += diem;
                            }
                        }
                        System.out.println("diem trung minh cua sinh vien nay la: " + (tongDiem / s.getDiemCacMon().size()));
                    }
                }
            }
            else {
                System.out.println("Vui long chon menu!");
            }
    }
}
}

