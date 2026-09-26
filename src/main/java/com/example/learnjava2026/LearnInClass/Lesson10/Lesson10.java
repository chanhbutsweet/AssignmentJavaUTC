package com.example.learnjava2026.LearnInClass.Lesson10;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> danhSachSP = new ArrayList<>();
        List<OrderItem> donHang = new ArrayList<>();

        while (true){
            System.out.println("-----------MENU----------");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi san pham");
            System.out.println("3. Them san pham vao hoa don");
            System.out.println("4. Xem hoa don");
            System.out.println("q. Quit");
            System.out.println("---------------------------");
            String check = scanner.nextLine();

            if (check.equals("1")){
                System.out.println("Nhap ma san pham: ");
                String ma = scanner.nextLine();
                System.out.println("Nhap ten san pham: ");
                String tenSP = scanner.nextLine();
                System.out.println("Nhap gia: ");
                double gia = scanner.nextDouble();
                scanner.nextLine();
                Product sp = new Product(ma, tenSP, gia);
                danhSachSP.add(sp);

            }else if (check.equals("2")){
                for (Product sp : danhSachSP) {
                    sp.hienThi();
                }
            }
            else if (check.equals("3")){
                System.out.println("Nhap ma san pham: ");
                String ma = scanner.nextLine();

                for (Product sp : danhSachSP) {
                    if (sp.getMaSP().equals(ma)) {
                        System.out.println("Nhap so luong: ");
                        int soLuong = scanner.nextInt();
                        scanner.nextLine();
                        OrderItem item = new OrderItem(sp, soLuong);
                        donHang.add(item);
                    }
                }
            }else if (check.equals("4")){
                for (OrderItem item : donHang) {
                    item.hienThi();
                }
            }else if (check.equals("q")){
                break;
            }
            else {
                System.out.println("Vui long chon menu!");
            }
        }
    }
}
