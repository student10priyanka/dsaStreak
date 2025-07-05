import java.util.Scanner;

public class rotateKstepsWithoutExtraSace {
    static void printArr(int[] arr){
        System.out.println("the reverse arrray is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr,int st,int ed){
        while(st<ed){
            swap(arr,st,ed);
            st++;
            ed--;
        }
    }
    static void rotate(int[] arr,int k){
        int n=arr.length;
        k=n%k;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the steps:");
        int k=sc.nextInt();

        rotate(arr,k);
        printArr(arr);
    }
}
