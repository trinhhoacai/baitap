import java.util.Scanner;

public class songuyento {
    //su dung vong lap whlie de kiem tra so nguyen to
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("nhap so");
         int so = scanner.nextInt();
         if(so<2){//nue so < 2
             System.out.println(so+"ko p so nguyen to");// thi in ra ko p so nguyen to
         }else {
             int i = 2;
             boolean check = true;
             while (i<=Math.sqrt(so)){// vong lap chay den khi i <= Math.sqrt(so)
                 if (so%i==0){// nue so%i==0
                     check=false;//kiem tra so%i hay ko
                     break;
                 }
                 i++;// tang them 1 don vi
             }
             if (check) {//nue dieu kien la check
                 System.out.println(so + "la so nguyen to");// in ra la so nguyen to
             } else{
                 System.out.println(so+"ko p số nguyên tố");// nue ko thoa man dieu kien in ra ko p so nuyen to
             }
         }
    }}

