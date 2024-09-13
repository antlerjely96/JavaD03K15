public class Main {
    public static void main(String[] args) {
        //Tạo 1 đối tượng DongVat, 1 đối tượng DongVatTrenCan
        DongVat dv = new DongVat();
        //Goi method an, ngu
        dv.an();
        dv.ngu();
        DongVatTrenCan dvtc = new DongVatTrenCan();
        //Gọi method
        dvtc.an();
        dvtc.ngu();
        dvtc.di();
        //Tạo đối tượng con người
        ConNguoi cn = new ConNguoi();
        cn.an();
        cn.ngu();
        cn.di();
        cn.noi();
    }
}
