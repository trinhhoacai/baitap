public class minphuongthuc {
    public static void main(String[] args) {
        // khai báo mảng num và tìm giá trị nhỏ nhất
        int[] num = {3, 5, 6, 8, 1};
        int indext = min(num);
        System.out.println("gia tri nho nhat la" + num[indext]);
    }

    public static int min(int[] num) {// sử dụng phương thức min
        int indext = 0;// khai báo biến indext
        for (int i = 0; i < num.length; i++) {// sử dụng vòng lặp for để duyệt mảng num
            if (num[i] < num[indext]) {// sử dụng cấu trúc điều kiện để tìm giá trị nhỏ nhất cua num
                indext = i;
            }
        }
        return indext;// trả về indext

    }
}
