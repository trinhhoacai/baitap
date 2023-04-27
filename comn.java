import java.util.Scanner;

public class comn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//
        System.out.println("nhap vào số hàng của bàn cờ");// in và gán giá trị hàng của bàn cờ
        int hang= scanner.nextInt();
        System.out.println("nhập vào số cột của bàn cờ");//in và gán giá trị ccot cua bàn cờ
        int cot = scanner.nextInt();
        for (int i = 1;i<=hang;i++){// dùng vòng lặp để in ra giá trị hàng của bàn cờ
            for(int j=1;j<=cot;j++){// dùng vòng lặp để in ra giá trị cột của bàn cờ
                System.out.println("*");// in ra * đại diện cho giá trị của cột
            }
            System.out.println();
        }
    }
}
