public class nguyento100 {
    public static void main(String[] args) {
        System.out.println("day so nguyen to co trong mang 100 phan tu la");
        for (int i = 0; i < 100; i++) { // sử dụng vòng lặp để in phần tử
             if (Check(i)){   // check kết quả với điều kiện trả về true thì in ra phần tử số nguyên tố nếu không thì không in
                 System.out.print(i +" ");
             }

        }
    }
    public static boolean Check(int num){ // gọi hàm sử dụng để kiểm tra số nguyên tố gồm 100 phần tử
        if (num < 2){ // nếu giá trị pần tử nhỏ hơn 2 thì bỏ qua
            return false;
        }
        for (int i = 2 ; i < Math.sqrt(num); i ++){ // dùng vòng lặp để tiến hành in số nguyên tố
            if (num % i == 0){ // nếu phần tử chia hết cho căn bậc 2  của phần tử đó thì bỏ qua
                return false;
            }
        }
        return true; // nếu không thì kết quả trả ề là số nguyên tố
    }
}






