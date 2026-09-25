package com.example.learnjava2026.LearnInClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        List<Integer> phanTu = new ArrayList<>();

        // nhap so phan tu
        System.out.println("Nhap so phan tu: ");
        n = scan.nextInt();
        for (int i = 0 ; i < n ; i ++){
            System.out.println("Nhap phan tu thu " + (i+1) + ": ");
            phanTu.add(scan.nextInt());
        }

        // in danh sach phan tu
        System.out.println("Danh sach phan tu: " + phanTu);

        // in danh sach phan tu tu nho den lon
        Collections.sort(phanTu);
        System.out.println("Danh sach tang dan: " + phanTu);

        // tinh trung binh cong cac phan tu
        int tong = 0;
        for (int i = 0 ; i < n ; i++){
            tong += phanTu.get(i);
        }
        System.out.println("So trung binh cong la: " + Float.valueOf(tong) / Float.valueOf(n));

        // so lon nhat
        System.out.println("So lon nhat la: " + phanTu.get(n-1));

        // so nho nhat
        System.out.println("So nho nhat la: " + phanTu.get(0));

        // xoa tat ca cac so chan
        for (int i = 0 ; i < phanTu.size() ; i++){
            if (phanTu.get(i) % 2 == 0){
                phanTu.remove(i);
                i--;
            }
        }
        System.out.println("danh sach sau khi xoa so chan: " + phanTu);
    }
}
