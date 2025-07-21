import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,4,5,5};
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);

            }
        }
        for(int keys : s){
            System.out.println(keys+" ");
        }
    }
}
