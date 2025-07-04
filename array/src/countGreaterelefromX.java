//count the number of elements dtrictly greter than value k

import java.util.Scanner;

public class countGreaterelefromX {
    public static int countGreater(int[] arr,int target){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>target){
            count++;
        }
    }
        return count;
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
        System.out.print("The count is:");
        System.out.println(countGreater(arr,target));

    }
}
