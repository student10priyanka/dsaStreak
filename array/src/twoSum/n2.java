package twoSum;
import java.util.Arrays;
public class n2 {
    public static int[] TwoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,6,8};
        int target=5;
        System.out.println(Arrays.toString(TwoSum(arr,target)));

    }
}
