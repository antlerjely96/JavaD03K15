public class HinhHoc {
    private double chuVi;
    private double dienTich;

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public HinhHoc(double chuVi, double dienTich) {
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }

    public HinhHoc() {
    }

    public void tinhChuVi(){}
    public void tinhDienTich(){}
}
