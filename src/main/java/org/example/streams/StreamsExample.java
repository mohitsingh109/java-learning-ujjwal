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
        List<Integer> result1 = numbers.stream() // for loop
                .filter(value -> value % 2 == 0) // if
                .toList();
    }
}
