package Bai1;

public class HinhVuong extends Hinh2D{
    public double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        this.chuVi = this.canh * 4;
        return this.chuVi;
    }

    @Override
    public double tinhDienTich() {
        this.dienTich = Math.pow(this.canh, 2);
        return this.dienTich;
    }

    @Override
    public void hienThi() {
        System.out.println("Cạnh: " + this.canh);
        System.out.println("Chu vi: " + this.tinhChuVi());
        System.out.println("Diện tích: " + this.tinhDienTich());
    }
}
