package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by miruna on 3/8/2017.
 */
public class MapExamples {

    // HashMap - when calling put(k,v) the hashCode() of the key object! is called;
    // when calling get() - the equals() method is called

    // bucket 1 -> Map.Entry a -> Map.Entry b -> ... (linked list)
    // bucket 2 -> Map.Entry a -> ...
    // bucket - items which have the same hashCode

    /**
     * What will happen if two different HashMap  key objects have the same hashcode?
     * They will be stored in the same bucket but no next node of linked list.
     * And keys equals () method will be used to identify correct key value pair in HashMap.
     */

    // HM.put(k,v) -> k.hashCode() //30 -> bucket(30)
    //HM.... -> k.hashCode() //40 -> bucket(40)
    //HM ... -> k.hashCode() //30 -> bucket(30)

    //HM.get(k) -> k.hashCode() && k.equals()

    public static void main(String[] args) {
        Map test = new HashMap();

        Person p1 = new Person("Lili", 10);
        Person p2 = new Person("Lulu", 8);

        test.put(1, p1);
        test.put(2, p2);

        System.out.println(test.get(2)); // Lulu is retrieved

    }


}
