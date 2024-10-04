public class HinhTron extends HinhHoc{

    protected double banKinh;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    @Override
    public void tinhChuVi(){
        this.setChuVi((this.banKinh) * 2 * Math.PI);
        System.out.println("Chu vi: " + this.getChuVi());
    }

    @Override
    public void tinhDienTich(){
        this.setDienTich(Math.pow(this.banKinh, 2) * Math.PI);
        System.out.println("Diện tích: " + this.getDienTich());
    }

    public void hienThiThongTin(){
        System.out.println("Bán kính: " + this.banKinh);
        tinhChuVi();
        tinhDienTich();
    }
}
