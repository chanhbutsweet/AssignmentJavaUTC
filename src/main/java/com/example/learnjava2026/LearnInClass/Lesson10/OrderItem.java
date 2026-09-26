package com.example.learnjava2026.LearnInClass.Lesson10;

public class OrderItem{
    private Product sanPham;
    private int soLuong;

    public OrderItem(Product sanPham, int soLuong) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public double thanhTien() {
        return sanPham.getGia() * soLuong;
    }

    public void hienThi() {
        System.out.println("Ten san pham: " + sanPham.getTenSP());
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + thanhTien());
    }
}
