package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollections {

    public static void main(String[] args) {

        // to remove duplicate data
        // or I want to perform look up with value (fast) O(log N)  read/black & AVL

        // java steams
        //.distinct() ==> Set
        Set<String> set = new HashSet<>();
        set.add("Mohit");
        set.add("Mohit");
        set.add("Karan");

        // set unique data
        for(String value: set) {
            System.out.println(value);
        }

    }
}
