import java.util.Scanner;

public class nhapgiatriphuongthuc {
    public static void main(String[] args) {
        // khai báo mảng num và dùng scn để nhập giá trị từ bàn phím
        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);
        //nhập giá trị vào mảng
        System.out.println("nhập giá trị các phân tử");
        for (int i = 0; i < num.length; i++) {// dùng vòng lặp for để gán giá trị vào mảng
            num[i] = scanner.nextInt();
        }
        // in ra giá trị của mảng
        System.out.println("giá trị các phần tu");
        for (int i = 0; i < num.length; i++) {// dùng vòng lặp for để in ra giá trị của mảng
            System.out.println(num[i]);
        }

    }
}
