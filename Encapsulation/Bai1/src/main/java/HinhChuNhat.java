public class HinhChuNhat extends HinhHoc{
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void tinhChuVi(){
        this.setChuVi((this.chieuDai + this.chieuRong) * 2);
        System.out.println("Chu vi: " + this.getChuVi());
    }

    @Override
    public void tinhDienTich(){
        this.setDienTich(this.chieuDai * this.chieuRong);
        System.out.println("Diện tích: " + this.getDienTich());
    }

    public void hienThiThongTin(){
        System.out.println("Chiều dài: " + this.chieuDai);
        System.out.println("Chiều rộng: " + this.chieuRong);
        tinhChuVi();
        tinhDienTich();
    }
}
