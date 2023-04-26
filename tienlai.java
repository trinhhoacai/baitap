import java.util.Scanner;

public class tienlai {
    // dùng vòng lặp for để tính lãi xuât
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double lai = 1.0;
        Scanner scanner=new Scanner(System.in);
            System.out.println("nhap tien");// gan gia tri tien vao ban phim
            tien=scanner.nextDouble();
            System.out.println("nhap thang");// gan gia tri thang vao ban phim
            thang=scanner.nextInt();
            System.out.println("nhap lai xuat");// gan gia tri lai xuat vao ban phim
            lai=scanner.nextDouble();
            double laitot=0;// bien lãi xuất nhận được
            for(int i=0;i<thang;i++){// điều kiện lặp i=0; i<thang;i++
                laitot += tien*(lai/100)/12*thang;//công thức tính lãi xuất nhận đc
            }
            System.out.println("lai nhan dc"+laitot);



        }
    }


