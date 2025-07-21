import java.util.ArrayList;

public class moveALLZEROES {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,3,0,5,0};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                ans.add(arr[i]);
            }
        }
        int n=arr.length;
        int len=ans.size();
        int diff=arr.length-len;
        for(int i=0;i<diff; i++){
            ans.add(0);
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
