import java.util.Scanner;

public class danhgialuchoc {
    public static void main(String[] args) {
        double diemChuyenCan;
        double diemKiemTra;
        double diemCuoiKi;
        Scanner scanner = new Scanner(System.in);
        diemChuyenCan=scanner.nextDouble();//gan gia tri diem chuyen can
        System.out.println("diem chuyen can");//hien thi diem chuyen can
        diemKiemTra=scanner.nextDouble();//gan gia tri diem kiem tra
        System.out.println("diem kiem tra");//hien thi diem kiem tra
        diemCuoiKi=scanner.nextDouble();// gan gia tri diem cuoi ky
        System.out.println("Diem cuoi ky");// hien thi diem cuoi ky
        double diemTong=(diemChuyenCan+diemKiemTra+diemCuoiKi)/3;// bien diem tong co phuong thuc (diemchuyencan+diemkiemtra+diemcuoiky)/3
        System.out.println("diem tong");
        if(diemTong>=8.5){
            System.out.println("diem A");//thoa man dieu kien diem tong >=8.5 se la diem A
        } else if (diemTong>=7&&diemTong<=8) {
            System.out.println("diem B");//thoa man dieu kien diem tong >=7 va <=8 se la diem B
            
        } else if (diemTong>=5.5&&diemTong<7) {// thoa man dieu kien diem tong >=5 va <7 se la diem C
            System.out.println("diem C");
        } else if (diemTong>=4&&diemTong<5.5) {// thoa man dieu kien diem tong >=4 va <5 se la diem C
            System.out.println("diem D");
        } else if (diemTong<4) {// thoa man dieu kien diem tong <4 se la diem F
            System.out.println("diem F");

        }
        else {
            System.out.println();
        }

    }}


