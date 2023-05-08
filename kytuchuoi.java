import java.util.Scanner;

public class kytuchuoi {
    public static void main(String[] args) {
        String chuoi;//kb chuoi
        char kytu='a';// kb ky tu
        int count = 0;// kb bien dem
        Scanner scanner= new Scanner(System.in);//nhap gia tri tu ban phim
        System.out.println("nhập vào chuỗi bất kì");// in nhập vào chuỗi bất kì
        chuoi=scanner.nextLine();//
        for(int i =0; i<chuoi.length();i++){// dùng vòng lặp for để duyệt mảng
            if(chuoi.charAt(i)==kytu){// thỏa mãn điều kiện (chuoi.charAt(i)==kytu)
                count++;//tang biến đếm
            }
        }
        System.out.println("số lần xuất hiện của ký tự"+kytu+"trong chuỗi"+count);//in ra màn hình

    }
}
