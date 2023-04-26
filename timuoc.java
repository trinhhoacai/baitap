import java.util.Scanner;

public class timuoc {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        a=scanner.nextInt();
        System.out.println("nhap b");
        b=scanner.nextInt();
        a=Math.abs(a);// hàm a
        b=Math.abs(b);// hàm b
        if(a==0||b==0){//a hoac b bang 0
            System.out.println("ko có ước chung lớn nhất");// in ra ko co uoc chung lon nhat
        }
        while (a!=b){// thoa man dieu kien a khac 0
            if(a>b){
                a= a-b;// nue a>b thi a= a-b
            }else{
                b=b-a;//nguoc lai b>a b=b-a
            }
            System.out.println("có ước chung lớn nhất"+a);// ket qua cuoi cung la uoc chung lon nhat

        }
    }
}
