package vn.edu.giadinh.test;

import java.util.Scanner;

public class Meo {
    String ten;
    int tuoi;
    String mausac;
    String giong;
    Meo next;

    Meo(){}

    Meo(String name,int age,String color,String sex){
        ten = name;
        tuoi = age;
        mausac = color;
        giong = sex;
    }

    public void inThongTin(){
        System.out.println("-------------------");
        System.out.println("Tên: "+ten);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Màu Sắc: "+mausac);
        System.out.println("Giới Tính: "+giong);
    }

    public void nhapThongTin(){
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = bienNhap.nextLine();
        System.out.println("Nhập Tuổi: ");
        tuoi = bienNhap.nextInt();
        System.out.println("Màu Sắc: ");
        bienNhap.nextLine();
        mausac = bienNhap.nextLine();
        System.out.println("Giống: ");
        giong = bienNhap.nextLine();
    }
}