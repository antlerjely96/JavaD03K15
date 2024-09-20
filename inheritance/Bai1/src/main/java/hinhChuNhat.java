import java.util.Scanner;

public class hinhChuNhat extends hinh2D{
    Scanner scanner = new Scanner(System.in);
    public double chieuDai;
    public double chieuRong;

    public double nhap(){
        double n;
        n = scanner.nextDouble();
        return n;
    }

    public double tinhChuVi(){
        chuVi = (chieuDai + chieuRong) * 2;
        return chuVi;
    }

    public double tinhDienTich(){
        dienTich = chieuDai * chieuRong;
        return dienTich;
    }
}
