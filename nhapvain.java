import java.util.Scanner;

public class nhapvain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//nhập giá trị từ bàn phím
        int[] mang = {1, 2, 3, 4, 5};// khai báo và khởi tạo mảng
        for (int i = 0; i < mang.length; i++) {// dùng vòng lặp for để duyệt mảng
            System.out.println("nhập giá trị của phần tử thứ " + i + "");// in ra
            mang[i] = scanner.nextInt();//gắn giá trị i từ bàn phím
        }
        System.out.println("thông tin của mảng là ");//in ra thông tin mảng
        for (int i = 0; i < mang.length; i++) {// dung vòng lặp for gắn giá trị

            System.out.println(mang[i] + "");// in ra mảng
        }
    }
}
