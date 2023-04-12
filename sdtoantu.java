import java.util.Scanner;

public class sdtoantu {
    public static void main(String[] args) {
        float chieudai;//khai bao bien
        float chieurong;// khai bao bien

        Scanner scanner=new Scanner(System.in);//khai bao doi tuong
        System.out.println("nhap chieu dai");
        chieudai=scanner.nextFloat();//nhap chieu dai
        System.out.println("nhap chieu rong");
        chieurong=scanner.nextFloat();//nhap chieu rong
        float dientich= chieudai*chieurong;
        System.out.println("dien tich="+dientich);//tinh dien tich hinh chu nhat

    }
}
