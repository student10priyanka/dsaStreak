import java.util.HashMap;

import java.util.Set; // ✅ ADD THIS LINE


public class majorityElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,1,3 ,5,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }else{
                map.put(arr[i],1);
            }

            //map.put(arr[i],map.getOrDefault(arr[i],0)+1)
        }

        Set<Integer> keySet=map.keySet();
        for(Integer key:keySet){      //or by avoinding above line can put inplace of keySet map.keySet()
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}
