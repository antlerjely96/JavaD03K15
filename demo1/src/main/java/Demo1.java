public class Demo1 {
    public static void main(String[] args) {
        //Khai báo biến và không gán giá trị cho biến
        int soNguyen1 = 3;
        //Khai báo biến và gán giá trị cho biến
        double soThuc1 = 5.0;
        //Khai báo hằng số Pi = 3.14
        final double Pi = 3.14;
        //Ép kiểu số nguyên sang số thực
        double soThuc2 = (double)soNguyen1;
        System.out.println(soThuc2);
        //Ép kiểu số thực sang số nguyên
        int soNguyen2 = (int)soThuc1;
        System.out.println(soNguyen2);
        //Khai báo chuỗi
        String chuoi1 = "50";
        System.out.println(chuoi1);
        //Ép kiểu String sang int
        int soNguyen3 = Integer.parseInt(chuoi1);
        System.out.println(soNguyen3);
        //Ép kiểu double sang String
        String chuoi2 = Double.toString(soThuc2);
        System.out.println(chuoi2);
    }
}
