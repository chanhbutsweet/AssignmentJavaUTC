package com.example.learnjava2026.LearnInClass.Lesson9;

import java.util.Map;

public class Student {
    private String ma;
    private String ten;
    private Map<String, Double> diemCacMon;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Map<String, Double> getDiemCacMon() {
        return diemCacMon;
    }

    public void setDiemCacMon(Map<String, Double> diemCacMon) {
        this.diemCacMon = diemCacMon;
    }

    public Student() {
    }

    public Student(String ma, String ten, Map<String, Double> diemCacMon) {
        this.ma = ma;
        this.ten = ten;
        this.diemCacMon = diemCacMon;
    }
}
