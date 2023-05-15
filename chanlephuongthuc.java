public class chanlephuongthuc {
    public static void main(String[] args) {
        //kiểm tra biến num là số chẵn hay số lẻ
        int num = 7;
        if (isEven(num)) {// thỏa mãn điều kiện isEven(num)
            System.out.println(num + "là số chẵn");//in ra số chẵn
        } else {
            System.out.println(num + "là số lẻ");//không thỏa mãn điều kiện in ra số lẻ
        }

    }

    public static boolean isEven(int num) {
        //gọi phương thức isEven để kiểm tra xem num có p là số chẵn hay số lẻ
        if (num % 2 == 0) {//nuế num thỏa mãn điều kiện num%2==0
            return true;//trả về true
        } else {
            return false;// ko thỏa mãn điều kiện trả về false
        }
    }
}
