import java.util.Scanner;

public class chenmang {
    public static void main(String[] args) {
        int[]num={3,1,2,5,6};//mang ban dau
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so can them");
        int num2=scanner.nextInt();// bien nhap so can them
        System.out.println("nhap vi tri");
        int index =scanner.nextInt();// bien nhap vi tri can them
        int[] new_num=new int [num.length+1];// mang moi
        for(int i = 0, j=0;i<new_num.length;i++){// duyet mang new_num
            if(i==index){//thoa man dieu kieni==index
                new_num[i]=num2;//
                continue;//thoat ra buoc lap
            }
            new_num[i]=num[j];
            j++;
        }
        for(int k=0;k<new_num.length;k++){// duyet mang va in ra mang moi
            System.out.println(new_num[k]);
        }

            }

        }











