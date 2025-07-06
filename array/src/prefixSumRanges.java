import java.util.Scanner;

public class prefixSumRanges {


    static int[] prefxSum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();

        int[] arr=new int[n+1];
        System.out.println("Enter the elements:");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();

        }
        int[] prefxAns=prefxSum(arr);
        System.out.println("Enter the q:");
       int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter the range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefxAns[r]-prefxAns[l-1];
            System.out.println("Sum="+ans);
        }

    }
}
