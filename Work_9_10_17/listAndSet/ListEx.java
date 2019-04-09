package listAndSet;

import java.util.*;

public class ListEx {
    
    public static void main(String[] args) {
        
        List list=new ArrayList();
        
        list.add("anik");
        list.add("shuvo");
        list.add("rudro");
        list.add("badol");
        list.add("aziz");
        list.add(new Integer(5));
        list.add(new Integer(6));
        list.add("rudro");
        list.add("aziz");
        list.add(new Integer(5));
        list.add(new Integer(6));
        
        //for(int i=0;i<list.size();i++)
        System.out.println(list);
        
    }
}
