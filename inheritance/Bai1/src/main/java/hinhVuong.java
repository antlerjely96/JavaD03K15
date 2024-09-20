import java.util.Scanner;

public class hinhVuong extends hinh2D{
    Scanner scanner = new Scanner(System.in);
    public double canh;

    public double nhap(){
        double n;
        n = scanner.nextDouble();
        return n;
    }

    public double tinhChuVi(){
        chuVi = canh * 4;
        return chuVi;
    }

    public double tinhDienTich(){
        dienTich = Math.pow(canh, 2);
        return dienTich;
    }
}
