public class Main {
    public static void main(String[] args) {
        hinhChuNhat[] hcn = new hinhChuNhat[4];

        for (int i = 0; i < hcn.length; i++){
            hcn[i] = new hinhChuNhat();
            System.out.println("Hình chữ nhật thứ: " + (i + 1));
            System.out.print("Nhập chiều dài: ");
            hcn[i].chieuDai = hcn[i].nhap();
            System.out.print("Nhập chiều rộng: ");
            hcn[i].chieuRong = hcn[i].nhap();
            System.out.print("Chu vi: ");
            hcn[i].chuVi = hcn[i].tinhChuVi();
            System.out.println(hcn[i].chuVi);
            System.out.print("Diện tích: ");
            hcn[i].dienTich = hcn[i].tinhDienTich();
            System.out.println(hcn[i].dienTich);
        }

        hinhVuong[] hv = new hinhVuong[4];
        for(int i = 0; i < hv.length; i++){
            hv[i] = new hinhVuong();
            System.out.println("Nhập thông tin của hình vuông thứ " + (i + 1));
            System.out.print("Cạnh: ");
            hv[i].canh = hv[i].nhap();
            System.out.println("Chu vi: " + hv[i].tinhChuVi());
            System.out.println("Dien tich: " + hv[i].tinhDienTich());
        }

        hinhTron[] ht = new hinhTron[4];
        for (int i = 0; i < ht.length; i++){
            ht[i] = new hinhTron();
            System.out.println("Nhập thông tin của hình tròn thứ " + (i + 1));
            System.out.print("Bán kính: ");
            ht[i].banKinh = ht[i].nhap();
            System.out.println("Chu vi: " + ht[i].tinhChuVi());
            System.out.println("Diện tích: " + ht[i].tinhDienTich());
        }
    }

}
