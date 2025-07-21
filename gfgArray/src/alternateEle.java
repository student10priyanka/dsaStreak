import java.util.ArrayList;

public class alternateEle {
    static void getAlternateEle(int[] arr,int x,ArrayList<Integer> res){
        if(x<arr.length){
            res.add(arr[x]);
             getAlternateEle(arr,x+2,res);
        }
    }
    static ArrayList<Integer> getEle(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        getAlternateEle(arr,0,res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        ArrayList<Integer> res=getEle(arr);
        for(int x:res){
            System.out.println(x+ " ");
        }

    }
}

