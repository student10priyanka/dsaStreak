import java.util.Scanner;

public class reverseAnArray {

   public static int[] reverse(int[] arr){
       int j=0;
       int[] ans=new int[arr.length];
       for(int i=arr.length-1;i>=0;i--){
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
            int[] ans=reverse(arr);
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
            }
    }
}
