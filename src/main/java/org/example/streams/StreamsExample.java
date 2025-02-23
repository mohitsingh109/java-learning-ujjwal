package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {

        //IterateOverList();

    }

    public static void IterateOverList() {

        //old
        List<String> names = Arrays.asList("John", "Jana", "Mohit");
                                                            //data
        for(String name: names) {
            System.out.println(name);
        }

        //new
        //names.forEach(  data -> System.out.println(data)  );
        names.forEach(System.out::println); // Method Reference

    }

    public static void filterAList() {
        //old
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = new ArrayList<>();

        for(Integer value: numbers) {
            if(value % 2 == 0) {
                result.add(value);
            }
        }

        //new
        List<Integer> result1 = numbers.stream() // for loop // Buffer
                .filter(value -> value % 2 == 0) // if
                .toList();

        long count = numbers.stream() // for loop // Buffer
                .filter(value -> value % 2 == 0) // if
                .count();
    }


    public static void transform() {

        //old
        List<String> server = Arrays.asList("WEB", "CACHE", "EC");

        List<String> result = new ArrayList<>();

        for(String value: server) {

        }

        //Arrays.asList("PING WEB", "PING CACHE", "PING EC");

        //steams

        List<String> result1 = server.stream() // for
                .map(value -> "PING " + value) // its job is to transform one value to another
                .toList();

//        List<Integer> ids = employess.steam()
//                .filter(e -> e.getDepartment().equals("IT"))
//                .filter(e -> e.getYearOfExp() > 5)
//                .filter(e -> e.getTech().contains("JAVA"))
//                .map(e -> e.getId()) // Employee Object ==> Int
//                .distinct()
//                .toList();


    }
}
