
import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {
        int [] num1={1,2,3};// mang thu nhat
        int [] num2={4,5,6};// mang thu hai
        int []num3=new int[num1.length+num2.length];// mang thu ba bang mang thu nhat + mang thu hai
        int index=0;
        for(int i = 0; i<num1.length;i++){//duyet mang thu nhat va gan vao mang thu ba
            num3[index]=num1[i];
            index++;
        }
        for(int j = 0 ; j<num2.length;j++){// duyet mang thu hai va gan vao mang thu ba
            num3[index]=num2[j];
            index++;
        }
        System.out.println(Arrays.toString(num3));// in mang thu 3

    }

    }


