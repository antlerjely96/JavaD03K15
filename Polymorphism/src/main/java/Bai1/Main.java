package Bai1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HinhChuNhat[] hcn = new HinhChuNhat[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Hình chữ nhật thứ " + i);
            hcn[i] = new HinhChuNhat();
            hcn[i].nhap(scanner);
            hcn[i].tinhChuVi();
            hcn[i].tinhDienTich();
            hcn[i].hienThi();
        }

        HinhTron[] ht = new HinhTron[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Hình tròn thứ " + i);
            ht[i] = new HinhTron();
            ht[i].nhap(scanner);
            ht[i].hienThi();
        }
        tinhDienTichMax(hcn);
        tinhChuViMin(ht);
    }

    public static void tinhDienTichMax(HinhChuNhat[] hcn){
        //Tìm diện tích max
        double max = hcn[0].dienTich;
        for (int i = 0; i < hcn.length; i++){
            if(max < hcn[i].dienTich){
                max = hcn[i].dienTich;
            }
        }
        //Hiển thị hcn có diện tích max
        for (int i = 0; i < 5; i++){
            if(hcn[i].dienTich == max){
                hcn[i].hienThi();
            }
        }
    }

    public static void tinhChuViMin(HinhTron[] ht) {
        //Tìm chu vi min
        double min = ht[0].chuVi;
        for (int i = 0; i < 5; i++) {
            if (min > ht[i].chuVi) {
                min = ht[i].chuVi;
            }
        }
        //Hiển thị hcn có diện tích max
        for (int i = 0; i < 5; i++) {
            if (ht[i].chuVi == min) {
                ht[i].hienThi();
            }
        }
    }
}
