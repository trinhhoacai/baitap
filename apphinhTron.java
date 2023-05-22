import java.util.Scanner;

public class apphinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// khởi tạo đối tượng scn lấy giữ liệu từ bàn phím
        System.out.println("điền màu");//điền màu
        String clor=scanner.nextLine();
        System.out.println("Điền bán kính");// điền bán kính
        double radius=scanner.nextDouble();
        hinhTron hinhTron=new hinhTron(radius);
        System.out.println("hinh tròn"+clor);// in ra màu
        System.out.println("chu vi hình tròn"+hinhTron.getchuvi());// in ra chu vi hình tròn

    }
}
