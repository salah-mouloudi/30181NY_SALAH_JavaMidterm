package datastructure;

import java.util.HashMap;
import java.util.Iterator;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and some data is inserted into it.
         Retrieve the Collection view of the values present in map
         */

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        for(int i = 1 ; i <= 6 ; i  ++){
            System.out.println("the key is : "+i+" and the value is : "+map.get(i));

        }
        for(HashMap.Entry<Integer, String> m: map.entrySet()){
            System.out.println(m.getValue());
        }

        Iterator<Integer> it = map.keySet().iterator();

        while(it.hasNext()){
            int key=  it.next();
            String value = map.get(key);

            System.out.println("the key num is : "+ key + " and the value is : "+ value);

        }
    }

}
