import java.util.Scanner;

public class sumArrEle {

    public static int sum(int[] arr,int idx){
        sum(arr,idx+1);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println(sum(arr,0));
    }
}
