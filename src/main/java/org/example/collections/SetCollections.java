package org.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections {

    public static void main(String[] args) {

        // to remove duplicate data,
        // or I want to perform look up with value (fast) O(log N)  read/black & AVL

        // csv, txt
        // main.csv(col1, col2, col3) , child1.csv, child2.csv
        // java steams
        //.distinct() ==> Set
        // it doesn't main the insertion order
        Set<String> set = new HashSet<>();
        set.add("Mohit");
        set.add("Mohit");
        set.add("Karan");
        set.add("Ujjwal");
        set.add("Aman");
        set.add("Arun");

        // set unique data
        for(String value: set) {
            System.out.println(value);
        }

        // to remove duplicate data,
        // or I want to perform look up with value (fast) O(log N)  read/black & AVL
        // I want data in increasing order

        System.out.println("=============  TreeSet ==========");

        Set<String> set2 = new TreeSet<>();
        set2.add("Mohit");
        set2.add("Mohit");
        set2.add("Karan");
        set2.add("Ujjwal");
        set2.add("Aman");
        set2.add("Arun");

        for(String value: set2) {
            System.out.println(value);
        }

        // to remove duplicate data,
        // or I want to perform look up with value (fast) O(log N)  read/black & AVL
        // you want insertion order

        // MS1 store HashSet<>() order maintain is not possible
        // MS1 ==> Data put db {"key": "value", "key1": "data"} (Dynamo DB NoSQL)
        // MS2 ==> (Dynamo DB NoSQL) + New Data ==> update else ignore

        System.out.println("=============  LinkedHashSet ==========");

        Set<String> set3 = new LinkedHashSet<>();

        set3.add("Mohit");
        set3.add("Mohit");
        set3.add("Karan");
        set3.add("Ujjwal");
        set3.add("Aman");
        set3.add("Arun");

        for(String value: set3) {
            System.out.println(value);
        }

        if(set3.contains("Karan")) {
            System.out.println("Yes karan is present");
        }

        set3.remove("Mohit");

        //set3.addAll(???);

        //db store
        if(!set3.isEmpty()) {
            System.out.println("Saving to DB...");
        }

        //set3.size();

        //DS
        if (set3.containsAll(List.of("Mohit", "Karan"))) {
            System.out.println("Yes both are present");
        }
        

        List<String> setToArray = new ArrayList<>(set3);
    }
}
