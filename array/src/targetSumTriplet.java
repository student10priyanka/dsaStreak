import java.util.Scanner;

public class targetSumTriplet {
    public static int TargetSumtriplet(int[] arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }

        }
        return ans;
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
        System.out.print("The ans is:");
        System.out.println(TargetSumtriplet(arr,target));

    }
}
