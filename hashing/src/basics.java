
import java.util.*;
public class basics {
    public static void main(String[] args){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for(String k:keys){
            System.out.println("keys="+k+",value="+hm.get(k));
        }
    }
}
//keySet is used toget the collections of keys,and seperately you have ti find the values
//entrySet is used to get the collection of key Value pair
