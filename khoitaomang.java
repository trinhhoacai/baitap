public class khoitaomang {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};// khoi tao mang
        for (int i = 0; i < num.length; i++) {// dùng vòng lặp for để duyệt mảng
            num[i] = i + 1;// phần tử của mảng tăng  1 giá trị
            System.out.println(num[i]);// in ra phần tử của mảng i
        }
    }
}