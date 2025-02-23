package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysCollection {

    public static void main(String[] args) {

        //Interface                  Implementation
        List<Integer> intList = new ArrayList<>();
        intList.add(10); // 0
        intList.add(20); // 1
        intList.add(30); // 2
        intList.add(40); // 3

        List<Integer> intList1 = List.of(10, 20, 30, 40);


        for(Integer value: intList) {
            System.out.println(value);
        }

        if(intList.contains(30)) {
            System.out.println("Yes 30 is preset");
        }

        //intList.remove(0);

        List<Integer> intList2 = new ArrayList<>();
        intList2.add(45);
        intList.add(77);

        intList.addAll(intList2);

        if(intList.containsAll(Arrays.asList(10, 40, 70))) {
            System.out.println("Yes all three number 10, 40, 70 are present.");
        }


        // where you don't know how many data will arrive in the system
        List<String> stringList = new LinkedList<>();
        //LinkedList : DDL

        stringList.add("Karan");
        stringList.add("Mohit");

        // immutable
        List<Integer> aList = Arrays.asList(10, 20, 30);

        // immutable
        List<String> notAllowedVideo = Arrays.asList("Java", "C++", "Devil", "Death", "ABC");



        //notAllowedVideo.remove("Death");

        List<Integer> lList = List.of(10, 20, 30); // 11

        //
        List<Integer> mList = new ArrayList<>() {{
            add(10);
            add(20);
            add(40);
        }};

        mList.add(50);
    }
}
