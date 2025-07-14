import java.util.HashSet;

public class removeDuplicates {
    static void printArr(int[] arr,int k){
        for(int i=0;i<k;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void remove2pointer(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        printArr(arr,i+1
        );
    }
    static void removeDuplicates(int [] arr){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int k=hs.size();
        int j=0;
        for(int x:hs){
            arr[j++]=x;
        }
        printArr(arr,k);
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,3,3,3};
        removeDuplicates(arr);
        System.out.println("Answer with 2 pointer:");
        remove2pointer(arr);
    }
}
