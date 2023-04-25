public class chanle10 {
    // su dung vong lap whlie de in ra 10 so chan va 10 so le
    public static void main(String[] args) {
        int sochan = 0;
        int solle = 0;
        int num = 0;// bien dem
        while (sochan < 10) {//thoa man dieu kien so chan < 10
            if (num % 2 == 0) {// thoa man dieu kien biem dem chia het cho 2
                System.out.println("in ra so chan" + num);// in ra so chan
                sochan++;// tang bien sochan
            }
            num++;// tang bien dem
        }
        System.out.println();
        while (solle < 10) {//thoa man dieu kien solle<10
            if (num % 2 == 1) {//thoa man dieu kien bien dem chia cho 2 du 1
                System.out.println("in ra số lẻ" + num);//in ra so le
                solle++;//tang bien solle
            }
            num++;//tang bien dem
        }
    }
}
