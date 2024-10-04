package Bai1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HinhChuNhat[] hcn = new HinhChuNhat[5];
        for (int i = 0; i < hcn.length; i++) {
            System.out.println("Nhập chiều dài và chiều rộng!");
            hcn[i] = new HinhChuNhat(scanner.nextDouble(), scanner.nextDouble());
            hcn[i].hienThi();
        }

        HinhVuong[] hv = new HinhVuong[5];
        for (int i = 0; i < hv.length; i++) {
            System.out.println("Nhập cạnh!");
            hv[i] = new HinhVuong(scanner.nextDouble());
            hv[i].hienThi();
        }
    }
}
