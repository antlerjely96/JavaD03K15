import java.util.Scanner;

public class hinhTron extends hinh2D{
    Scanner scanner = new Scanner(System.in);
    public double banKinh;

    public double nhap(){
        double n;
        n = scanner.nextDouble();
        return n;
    }

    public double tinhChuVi(){
        chuVi = Math.PI * banKinh;
        return chuVi;
    }

    public double tinhDienTich(){
        dienTich = 2 * Math.PI * Math.pow(banKinh, 2);
        return dienTich;
    }
}
