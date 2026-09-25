package com.example.learnjava2026.Section3;

public class Lesson17 {
    public static void main(String[] args) {
        int myIntergerValue = 10000;
        System.out.println(myIntergerValue);

        // giá trị MIN của Interger
        myIntergerValue = Integer.MIN_VALUE;
        System.out.println("Interger MIN value: "+myIntergerValue);

        // giá trị MAX của Interger
        myIntergerValue = Integer.MAX_VALUE;
        System.out.println("Interger MAX value: "+myIntergerValue);

        // giá trị MAX của Interger
        myIntergerValue = Integer.MAX_VALUE;
        System.out.println("Interger value range "+ Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE);

        System.out.println("-1 vao gia tri nho nhat= " + (Integer.MIN_VALUE - 1));
        // -> min value - 1 = max value

        System.out.println("+1 vao gia tri lon nhat= " + (Integer.MAX_VALUE + 1));
        // -> max value +1 = min value

//        int myMaxValue = 2147483648;
        // -> lỗi số quá lớn so với kiểu dữ liệu

//        int myMinValue = -2147483649;
        // -> lỗi số quá nhỏ so với kiểu dữ liệu

        int myMaxValue = 2_147_483_647;
        // -> có thể dung "_" để đánh dấu số cho dễ đọc mà không ảnh hưởng đến giá trị

        // giá trị MAX của Long
        System.out.println("Interger MAX value: "+ Long.MAX_VALUE);

        // giá trị MIN của Long
        System.out.println("Interger MAX value: "+ Long.MIN_VALUE);

    }
}
