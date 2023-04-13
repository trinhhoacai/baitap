import java.util.Scanner;
public class giaiptbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");//thông báo chức năng của chương trình và định dạng
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble(); // nhập và gán giá trị cho a

        System.out.print("b: ");
        double b = scanner.nextDouble(); // nhập và gán giá trị  cho b

        System.out.print("c: ");
        double c = scanner.nextDouble(); // nhập và gán giá trị cho c
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);// thỏa mãn điều kiện a khac 0 sẽ thực hiện khối lệnh bên trong if
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");// thỏa mãn điều kiên b=c sẽ thực hiện khối lệnh bên trong if
            } else {
                System.out.print("No solution!");// hiển thị khi không có bất kì diều kiện nào ở trên đáp ứng.
            }
        }
    }

}
