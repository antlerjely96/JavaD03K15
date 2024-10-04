package Bai1;

public class HinhChuNhat extends Hinh2D{
    public double chieuDai;
    public double chieuRong;
    @Override
    public double tinhChuVi() {
        this.chuVi = (this.chieuDai + this.chieuRong) * 2;
        return this.chuVi;
    }

    @Override
    public double tinhDienTich() {
        this.dienTich = this.chieuDai * this.chieuRong;
        return this.dienTich;
    }
}
