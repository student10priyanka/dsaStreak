import java.util.Scanner;

public class sortZerosOnes {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);;
        }
    }
    static void sortArr(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
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
        sortArr(arr);
        printArr(arr);


    }
}
