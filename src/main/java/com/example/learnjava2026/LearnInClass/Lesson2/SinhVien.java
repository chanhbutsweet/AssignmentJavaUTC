package com.example.learnjava2026.LearnInClass.Lesson2;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String gioiTinh;
    private double diemChuyenCan;
    private double diemKiemTra;
    private double diemBaiTapLon;
    private double diemQuaTrinh;
    private double diemThi;
    private double diemKetThucHocPhan;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, String gioiTinh, double diemChuyenCan, double diemKiemTra, double diemBaiTapLon, double diemQuaTrinh, double diemThi, double diemKetThucHocPhan) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diemChuyenCan = diemChuyenCan;
        this.diemKiemTra = diemKiemTra;
        this.diemBaiTapLon = diemBaiTapLon;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemThi = diemThi;
        this.diemKetThucHocPhan = diemKetThucHocPhan;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemChuyenCan() {
        return diemChuyenCan;
    }

    public void setDiemChuyenCan(double diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
    }

    public double getDiemKiemTra() {
        return diemKiemTra;
    }

    public void setDiemKiemTra(double diemKiemTra) {
        this.diemKiemTra = diemKiemTra;
    }

    public double getDiemBaiTapLon() {
        return diemBaiTapLon;
    }

    public void setDiemBaiTapLon(double diemBaiTapLon) {
        this.diemBaiTapLon = diemBaiTapLon;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public double getDiemKetThucHocPhan() {
        return diemKetThucHocPhan;
    }

    public void setDiemKetThucHocPhan(double diemKetThucHocPhan) {
        this.diemKetThucHocPhan = diemKetThucHocPhan;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diemChuyenCan=" + diemChuyenCan +
                ", diemKiemTra=" + diemKiemTra +
                ", diemBaiTapLon=" + diemBaiTapLon +
                ", diemQuaTrinh=" + diemQuaTrinh +
                ", diemThi=" + diemThi +
                ", diemKetThucHocPhan=" + diemKetThucHocPhan +
                '}';
    }
}
