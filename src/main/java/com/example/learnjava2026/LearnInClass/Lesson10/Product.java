package com.example.learnjava2026.LearnInClass.Lesson10;

public class Product {
    private String maSP;
    private String tenSP;
    private double gia;

    public Product(String maSP, String tenSP, double gia){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void hienThi() {
        System.out.println("Ma san pham: " + maSP);
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Gia san pham: " + gia);
    }
}
