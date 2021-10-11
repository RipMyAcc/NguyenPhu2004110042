package com.phunguyen2004110042.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTestDrive {
    public static void main(String[] args) {
        menu();
}
    static ArrayList<Bai> svgd =new ArrayList();
    static Scanner scanner = new Scanner(System.in);
    static public void menu(){
        System.out.println("1.	Nhập danh sách sinh viên");
        System.out.println("2.	Xuất danh sách sinh viên đã nhập");
        System.out.println("3.	Xuất danh sách sinh viên theo khoảng điểm");
        System.out.println("4.	Tìm sinh viên theo họ tên");
        System.out.println("5.	Tìm và sửa sinh viên theo họ tên");
        System.out.println("6.	Tìm và xoá sinh viên theo họ tên");
        System.out.println("7.	Kết thúc");
        System.out.print("Nhập số để thực hiện chức năng: ");
        int nhap = scanner.nextInt();
        switch(nhap){
            case 1: nhap(); break;
            case 2: xuat(); break;
            case 3: xuattheodiem(); break;
            case 4: tim(); break;
            case 5: timsua(); break;
            case 6: timxoa(); break;
            case 7: System.exit(0);
        }
    }
    static public void nhap(){
        System.out.println("====Nhập sinh viên====");
        while(true){
            scanner.nextLine();
            System.out.print("Tên:");
            String ten = scanner.nextLine();
            System.out.print("Điểm trung bình:");
            Double diem = scanner.nextDouble(); 
            svgd.add(new Bai(ten, diem));
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.next().equals("N")){
            break;
            }
        }
        menu();
    }
    static public void xuat(){
        System.out.println("====In danh sách sinh viên sau khi nhập===");
        for(Bai x:svgd){
            x.inthongtin();
            System.out.println();
        }
        scanner.next();
        menu();
    }
    static public void xuattheodiem(){
        System.out.println("====In danh sách theo điểm===");
        System.out.print("Từ: ");
        double tu = scanner.nextDouble();
        System.out.print("Tới: ");
        double toi = scanner.nextDouble();
        System.out.println();
        for(Bai x:svgd){
            if(x.diem>=tu&x.diem<=toi){
                x.inthongtin();
                System.out.println();
            }
        }
        scanner.next();
        menu();
    }
    static public void tim(){
        System.out.println("====Tìm sinh viên theo họ tên===");
        scanner.nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        String nhap = scanner.nextLine();
        for(Bai x:svgd){
            if(x.ten.equals(nhap)){
                x.inthongtin();
                break;
            }
                            
        }
        scanner.next();
        menu();
    }
    static public void timsua(){
        System.out.println("====Tìm sinh viên và sửa sinh viên theo họ tên===");
        scanner.nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        String nhap = scanner.nextLine();
        int i=0;
        for(Bai x:svgd){
            if(x.ten.equals(nhap)){
                x.inthongtin();
                System.out.println("===Sửa===");
                System.out.print("Tên:");
                String ten = scanner.nextLine();
                System.out.print("Điểm trung bình:");
                Double diem = scanner.nextDouble();
                x = new Bai(ten, diem);
                svgd.set(i, x);
                break;
            }
            i++;    
        }
        scanner.next();
        menu();
    }
    static public void timxoa(){
        System.out.println("====Tìm sinh viên và xoá sinh viên theo họ tên===");
        scanner.nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        String nhap = scanner.nextLine();
        int i=0;
        for(Bai x:svgd){
            if(x.ten.equals(nhap)){
                svgd.remove(i);
                break;
            }
            i++;    
        }
        scanner.next();
        menu();
    }
}
