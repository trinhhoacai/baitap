public class rectangle {
    double chieudai,chieurong;// kb biến hình
    public rectangle(){// khởi tạo đối tượng

    }
    public rectangle(double chieudai,double chieurong){// khởi tạo đối tượng chiều dài và chiều rộng
        this.chieurong=chieurong;
        this.chieudai=chieudai;
    }
    public double getdientich(){// khởi tạo phương thức tính diện tích hình chũ nhật
        return this.chieudai*this.chieurong;
    }
    public double getchuvi(){// khởi tạo phương thức tính chu vi hình chữ nhật
        return (this.chieurong+this.chieudai)*2;
    }
    public String display(){// khởi tạo phương thức display
        return "rectangle{"+"chieu dai="+chieudai+",chieu rong"+chieurong+"}";
    }

    }

