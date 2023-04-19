import java.util.Scanner;

public class ngaythang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");// hien thi thang ma ban muon nhap
        int month = scanner.nextInt();// gan gia tri
        switch (month) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");//thang 2 co 28 hoac 29 ngay .
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + month + "' has 31 days!");// nhung thang co 30 ngay
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + month + "' has 30 days!");// nhung thang co 31 ngay
                break;
            default:
                System.out.print("Invalid input!");// nue ko co cac thang tren se in ra khong hop le
                break;
}}}

