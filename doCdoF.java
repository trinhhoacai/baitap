public class doCdoF {
    public static void main(String[] args) {
        //chuyển đổi do c sang độ F
        double doC=25;
        double doF= chuyendoidoCsangdoF(doC);
        System.out.println(doC+"do C"+doF+"do F");
        //chuyển đổi độ F sang độ C
        doF=77;
        doC=chuyendoidoFsangdoC(doF);
        System.out.println(doF+"Do F"+doC+"do F");
    }
    // phuong thuc chuyendoidoCsangdoF nhận đầu vào là độ C và trả vềgiá trị độ F tương ứng
    public static double chuyendoidoCsangdoF(double doC){
        return doC*1.8+32;
    }
    // phương thức chuyendoidoFsangdoC nhận đầu vào là độ F và trả về giá trị độ C tương ứng
    public static double chuyendoidoFsangdoC(double doF){
        return (doF -32)/1.8;
    }
}
