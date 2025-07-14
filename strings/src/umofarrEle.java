import java.util.Scanner;

public class umofarrEle {

    public static int sum(int[] arr,int idx ){
        if(idx==arr.length){
            return 0;
        }
        int smallAns=sum(arr,idx+1);
        return smallAns+arr[i];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(sum(arr,0));
    }
}
