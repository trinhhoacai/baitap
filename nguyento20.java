import java.util.Scanner;

public class nguyento20 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        System.out.println("20 so nguyen to dau tien la");
        while (count < 20) {//biến count < 20

            boolean prime = true;
            for (int i = 2; i <= number / 2; i++) {//biến i bắt đầu từ 2 biến i sẽ nhỏ hơn hoặc bang number/2; biến i tăng dần
                if (number % i == 0) {//biến number chia hết cho i
                    prime = false;
                    break;//thì dừng lại
                }
            }
            if (prime) {// nuế prime
                System.out.println(number + "");
                count++;// tăng giá trị của count
            }
            number++;// tăng giá trị của number đến 20 thì dừng lại


        }
    }
}