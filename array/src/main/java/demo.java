public class demo {
    public static void main(String[] args) {
        //Khai báo mảng số nguyên có 5 phần tử, có tên arr, không gán giá trị cho phần tử trong mảng
        int[] arr = new int[8];
        //Khai báo và gán giá trị cho phần tử của mảng
        int[] a = {5, 6};
        //Lấy phần tử đầu tiên của mảng a
        System.out.println("Phần tử đầu tiên của mảng a: a[0] = " + a[0]);
        //Lấy độ dài (số lượng phần tử của mảng): dùng hàm length
        //Ví dụ: Lấy độ dài của mảng arr
        System.out.println("Số phần tử của mảng arr là: " + arr.length);
        //Để làm việc với lần lượt từng phần tử của mảng: dùng vòng lặp chạy từ phần tử đầu tiên (phần tử có index = 0 đến phần tử có index = n - 1)
    }
}
