import java.util.Scanner;

public class checkArraySorted {
    public static boolean sorted(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
           if(arr[i]<arr[i-1]){
               check=false;
               break;
           }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n=sc.nextInt();

        System.out.println("the Elements are:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The occ is:");
        System.out.println(sorted(arr));

    }
}
