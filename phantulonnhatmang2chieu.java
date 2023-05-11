public class phantulonnhatmang2chieu {public static void main(String[] args) {
    int [] [] num = {
            {1,2,3},
            {9,8,7},
            {4,5,6},
    };// kb mang hai chieu
    int max = num[0][0];// bien max

    for (int i=0; i<num.length;i++){// duyet mang thu nhat
        for(int j = 0; j< num.length;j++){// duyet mang thu hai
            if(num[i][j]>max){// thoa man dieu kien num[i] [j] > max
                max=num[i][j];//thi max = num[i][j]

            }

        }

    }
    System.out.println("phan tu lon nhat trong mang hai chieu"+max);// in ra phan tu lon nhat trong mang hai chieu
}
}

