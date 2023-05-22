public class hinhTron {
    String clor;//kb biến
    double radius;// kn biến
    public hinhTron(double radius){// khởi tạo đối tượng của một lớp
        this.radius=radius;

    }
    public String color (String clor){//khởi tạO phương thức
        this.clor=clor;
        return clor;
    }
    public double getradius(){//phương thúc tra về bán kính hình tròn
        return radius;
    }
    public double getchuvi(){//phương thức tính chu vi
        return Math.PI*this.radius*this.radius;
    }



}
