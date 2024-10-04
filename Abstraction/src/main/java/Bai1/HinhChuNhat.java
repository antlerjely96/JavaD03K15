package Bai1;

public class HinhChuNhat extends Hinh2D{
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

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

    @Override
    public void hienThi() {
        System.out.println("Chiều dài: " + this.chieuDai);
        System.out.println("Chiều rộng: " + this.chieuRong);
        System.out.println("Chu vi: " + this.tinhChuVi());
        System.out.println("Diện tích: " + this.tinhDienTich());
    }


}
