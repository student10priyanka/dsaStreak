import java.util.Scanner;

public class sortInNonDecreasingOrder {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);;
        }
    }
    static int[] nonDec(int[] arr){
        int k=0;
        int[] ans=new int[arr.length];
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];

                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            swap(arr,left,right);
            left++;
            right--;
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

            int[] ans=nonDec(arr);
           reverse(ans);
            printArr(ans);


        }
    }

