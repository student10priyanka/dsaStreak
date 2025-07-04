import java.util.Scanner;

public class targetSumPair {
    public static int TargetSum(int[] arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return   ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:");
        int n=sc.nextInt();
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        System.out.println("the Elements are:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The occ is:");
        System.out.println(TargetSum(arr,target));

    }
}
