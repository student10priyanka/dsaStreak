import java.util.Scanner;

class reverseWithourExtraArray {
    public static void swapArr(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverseArray(int[] arr){
        int j=arr.length-1;
int i=0;
       while(i<j){
           swapArr(arr,i,j);
           i++;
           j--;
       }

    }
    public static void printArray(int[] arr){
        System.out.println("Array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
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
        reverseArray( arr);
        printArray(arr);
    }
}
