import java.util.Scanner;

public class timgiatri {
    public static void main(String[] args) {
        String[] sinhvien = {"trịnh", "hoa", "hùng", "tùng", "dương", "ly", "xuân tú", "lan anh", "toàn", "anh tú", "trường", "hòa"};//khởi tạo mảng
        Scanner scanner = new Scanner(System.in);// nhập giá trị từ bàn phím
        System.out.println("nhap ten sinh vien");
        String input_name = scanner.nextLine();// kb biến lưu tên tìm kiếm
        boolean isSxist = false;//kb biến isSxist trả về giá trị false
        for (int i = 0; i < sinhvien.length; i++) {// dùng vòng lặp for để duyệt mảng
            if (sinhvien[i].equals(input_name)) {// thỏa mãn điều kiện (sinhvien[i].equals(input_name)
                System.out.println("vị trí của sinh viên" + input_name + "là" + i);//in ra vị trí của sinh viên
                isSxist = true;//isSxist trả về giá trị true
                break;// kết thúc
            }

        }
        if (!isSxist) {// thỏa mãn điều kiện (!isSxist)
            System.out.println("ko có trong danh sách" + input_name);//in ra không có trong danh sách
        }

    }}




