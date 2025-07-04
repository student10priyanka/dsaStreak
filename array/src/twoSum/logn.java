package twoSum;

import java.util.Arrays;
import java.util.HashMap;


public class logn {
    public static int[] TwoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(arr[i],i);

        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,6,8};
        int target=5;
        System.out.println(Arrays.toString(TwoSum(arr,target)));

    }
}
