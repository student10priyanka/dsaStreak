import java.util.Scanner;

public class checkSubArrayQuality {
    static int findArray(int[] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum=findArray(arr);
        int prefxSum=0;
        for(int i=0;i<arr.length;i++){
            prefxSum+=arr[i];
            int suffixSum=totalSum-prefxSum;
            if(suffixSum==prefxSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("equal Partition possible:"+ equalSumPartition(arr));
    }
}
