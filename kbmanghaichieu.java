public class kbmanghaichieu {
    public static void main(String[] args) {
        int [] [] num = {
                {1,2,3},
                {9,8,7},
                {4,5,6},
        };// khai bao mang hai chieu

        for (int i=0; i<num.length;i++){// duyet mang thu nhat
            for(int j = 0; j< num.length;j++){// duyet mang thu hai
                System.out.print(num[i][j]+"");// in cac phan tu ra
            }
        }
    }
}
