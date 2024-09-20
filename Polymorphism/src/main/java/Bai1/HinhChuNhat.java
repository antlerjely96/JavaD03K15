package Bai1;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc2D{
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat(){}

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void nhap(Scanner scanner){
        System.out.print("Nhập chiều dài: ");
        this.chieuDai = scanner.nextDouble();
        System.out.print("Nhap chiều rộng: ");
        this.chieuRong = scanner.nextDouble();
    }

    @Override
    public void hienThi(){
        System.out.println("Chu vi: " + this.chuVi);
        System.out.println("Diện tích: " + this.chieuRong);
    }

    @Override
    public void tinhChuVi(){
        this.chuVi = (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public void tinhDienTich(){
        this.dienTich = this.chieuDai * this.chieuRong;
    }
}
