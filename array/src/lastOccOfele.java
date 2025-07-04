import java.util.Scanner;

public class lastOccOfele {
    public static int lastOcc(int[] arr,int target){
        int found=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=i;
            }
        }
        return found;
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
        System.out.println(lastOcc(arr,target));

    }
}
