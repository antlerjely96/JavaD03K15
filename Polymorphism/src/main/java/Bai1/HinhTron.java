package Bai1;

import java.util.Scanner;

public class HinhTron extends HinhHoc2D{
    public double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void nhap(Scanner scanner){
        System.out.print("Nhập bán kính");
        this.banKinh = scanner.nextDouble();
    }

    @Override
    public void hienThi(){
        System.out.println("Chu vi: " + this.chuVi);
        System.out.println("Diện tích: " + this.dienTich);
    }

    @Override
    public void tinhChuVi(){
        this.chuVi = 2 * Math.PI * this.banKinh;
    }

    @Override
    public void tinhDienTich(){
        this.dienTich = 2 * Math.PI * Math.pow(banKinh, 2);
    }
}
