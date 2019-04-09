package listAndSet;

import java.util.*;

public class MapEx {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("seven", new Integer(7));
        map.put("two", "2nd");
        map.put("one", new Integer(1));
        map.put("two", new Integer(2));
        map.put("three", "3rd");
        map.put("three", "3rd");
        map.put("three", new Integer(3));
        
        
        Set set = map.keySet();
        Collection collection = map.values();
        Set set1 = map.entrySet();
        
        System.out.println(set+"\n"+collection+"\n"+set1);

    }
}
