import java.util.Scanner;

public class printArrayEle {
    public static void printEle(int[] ele,int idx){
        if(idx==ele.length){
            return ;
        }
        System.out.println(ele[idx]);
        printEle(ele,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printEle(arr,0);
    }
}
