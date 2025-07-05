import java.util.Scanner;

public class rotateKsteps {
    static int[] rotakeKstep(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:");
        int n=sc.nextInt();

        System.out.println("the Elements are:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k:");
        int k=sc.nextInt();
        int[] ans=rotakeKstep(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
