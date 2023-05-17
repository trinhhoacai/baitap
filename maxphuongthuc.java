public class maxphuongthuc {
    public static void main(String[] args) {
        // khai báo mảng num và tìm giá trị lớn nhất của mảng
        int[] num = {1, 2, 3, 4, 5, 6};
        int indext = max(num);
        System.out.println("gia tri lon nhat la" + num[indext]);
    }

    public static int max(int[] num) {// sử dụng phương thức max
        int indext = 0;// khai báo biến indext
        for (int i = 0; i < num.length; i++) {//sử dụng vòng lặp for để duyệt mảng num
            if (num[i] > num[indext]) {// sử dụng cấu trúc điều kiện để tìm giá trị lớn nhất của mảng num
                indext = i;

            }
        }
        return indext;//trả về indext

    }
}
