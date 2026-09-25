package com.example.learnjava2026.LearnInClass.Lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        List<SinhVien> listSinhVien = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n;

        while (true){
            String checkMenu;
            System.out.println("-----------------------------------------------------------");
            System.out.println("---------------------Chon chuc nang------------------------");
            System.out.println("1.Them sinh vien");
            System.out.println("2.Hien thi danh sach sinh vien");
            System.out.println("3.Tim kiem theo ma");
            System.out.println("4.Sap xep danh sach theo diem giam dan");
            System.out.println("Q. Thoat");
            System.out.println("-----------------------------------------------------------");
            checkMenu = scan.nextLine();
            if (checkMenu.equals("1")){
                //them sinh vien
                System.out.println("Nhap so luong sinh vien muon them: ");
                n = scan.nextInt();
                scan.nextLine();
                for (int i = 0 ; i < n ; i++){
                    SinhVien sinhVien = new SinhVien();
                    System.out.println("Nhap ma sinh vien thu " + (i+1) + ": ");
                    sinhVien.setMaSinhVien(scan.nextLine());

                    System.out.println("Nhap ho ten sinh vien thu " + (i+1) + ": ");
                    sinhVien.setHoTen(scan.nextLine());

                    System.out.println("Nhap gioi tinh sinh vien thu " + (i+1) + ": ");
                    sinhVien.setGioiTinh(scan.nextLine());

                    System.out.println("Nhap diem chuyen can thu " + (i+1) + ": ");
                    sinhVien.setDiemChuyenCan(scan.nextDouble());
 
                    System.out.println("Nhap diem kiem tra thu " + (i+1) + ": ");
                    sinhVien.setDiemKiemTra(scan.nextDouble());

                    System.out.println("Nhap diem bai tap lon thu " + (i+1) + ": ");
                    sinhVien.setDiemBaiTapLon(scan.nextDouble());

                    sinhVien.setDiemQuaTrinh((sinhVien.getDiemChuyenCan() + 2 * sinhVien.getDiemKiemTra() + 3 * sinhVien.getDiemBaiTapLon() ) / 6);

                    System.out.println("Nhap diem thi thu " + (i+1) + ": ");
                    sinhVien.setDiemThi(scan.nextDouble());

                    sinhVien.setDiemKetThucHocPhan((sinhVien.getDiemQuaTrinh() + sinhVien.getDiemThi()) / 2);
                    scan.nextLine();
                    listSinhVien.add(sinhVien);
                }
            }else if (checkMenu.equals("2")){
                // hien thi danh sach sinh vien theo bang
                System.out.println("Danh sach sinh vien: ");
                for (SinhVien sv : listSinhVien){
                    System.out.println(sv);
                }
            }else if (checkMenu.equals("3")){
                // tim sinh vien theo ma
                System.out.println("Nhap ma sinh vien can tim: ");
                String maTim = scan.nextLine();
                for (SinhVien sv : listSinhVien){
                    if (sv.getMaSinhVien().equals(maTim)){
                        System.out.println("Sinh vien can tim la: " + sv);
                        break;
                    }
                }
            }else if (checkMenu.equals("4")){
                // sap xep theo diem giam dan
                listSinhVien.sort(Comparator.comparingDouble(SinhVien::getDiemKetThucHocPhan).reversed());
                for (SinhVien sv : listSinhVien){
                    System.out.println("Danh sach sinh vien sap xem tu cao den thap la:\n" + sv);
                }
            }else {
                break;
            }
        }
    }
}
