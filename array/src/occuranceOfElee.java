import java.util.Scanner;

public class occuranceOfElee {
    public static int countOcc(int[] arr,int x){
        int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
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
        System.out.println(countOcc(arr,target));

    }
}
