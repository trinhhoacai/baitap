import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choise = -1;
        Scanner scanner = new Scanner(System.in);
        while (choise != 0) {// thỏa mãn điều kiện lặp để hiển thị các tình huống để lựa chọn
            System.out.println("menu");
            System.out.println(1 + "ve hinh tam giac");
            System.out.println(2 + "vẽ hình vuông");
            System.out.println(3 + "vẽ hình chữ nhật");
            System.out.println(0 + ".thoat");
            System.out.println("chọn");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:// chọn case 1 và hiển thị
                    System.out.println("ve hinh tam giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:// chọn case 2 và hiển thị
                    System.out.println("vẽ hình vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:// chọn case 3 và hiển thị
                    System.out.println("vẽ hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0://chọn case 0 cà hiển thị
                    System.exit(0);
                default:
                    System.out.println("ko chon");

            }
        }
    }
}
