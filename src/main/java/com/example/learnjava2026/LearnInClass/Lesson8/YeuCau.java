package com.example.learnjava2026.LearnInClass.Lesson8;

public class YeuCau {
    private String id;
    private String moTa;
    private int mucDoUuTien;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getMucDoUuTien() {
        return mucDoUuTien;
    }

    public void setMucDoUuTien(int mucDoUuTien) {
        this.mucDoUuTien = mucDoUuTien;
    }

    public YeuCau() {
    }

    public YeuCau(String id, String moTa, int mucDoUuTien) {
        this.id = id;
        this.moTa = moTa;
        this.mucDoUuTien = mucDoUuTien;
    }
}
