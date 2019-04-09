package listAndSet;

import java.util.*;

public class SetEx {

    public static void main(String[] args) {

        Set set = new HashSet();

        set.add("anik");
        set.add("shuvo");
        set.add("rudro");
        set.add("badol");
        set.add("aziz");
        set.add(new Integer(5));
        set.add(new Integer(6));
        set.add("rudro");
        set.add("aziz");
        set.add(new Integer(5));
        set.add(new Integer(6));

        System.out.println(set);

    }
}
