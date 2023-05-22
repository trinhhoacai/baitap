import java.util.Scanner;

public class apprectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// khởi tạo đối tượng scn lấy giá trị từ bàn phím
        System.out.println("dien chieu dai");// điền chiều dài
        double chieudai= scanner.nextDouble();
        System.out.println("dien chieu rộng");// điền chiều rộng
        double chieurong=scanner.nextDouble();
        rectangle rectangle=new rectangle(chieudai,chieurong);
        System.out.println("hình chữ nhật"+rectangle.display());//in ra giá trị của chiều dài và chiều rộng của hình chữ nhật
        System.out.println("diện tích hình chữ nhật"+rectangle.getdientich());// in ra diện tích hình chữ nhật
        System.out.println("chu vi hinh chữ nhật"+rectangle.getchuvi());//in ra chu vi hình chữ nhật
    }
}
