package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        //IterateOverList();
        // findFirst();
        //covertUserToNameList();
        // joinString();
        //partitionDataEvenOdd();
        //groupByStringLength();
        //flatMap();
        debugging();
    }

    public static void IterateOverList() {

        //old
        List<String> names = Arrays.asList("John", "Jana", "Mohit");
                                                            //data
        for(String name: names) {
            System.out.println(name);
        }

        //new
        names.forEach(  data -> System.out.println(data)  );
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

    public static void countElement() {

        List<String> names = Arrays.asList("Mohit", "Jack", "Jone", "Karan", "Kartika");

        // Old
        int count = 0;
        for(String name: names) {
            if(name.contains("J")) {
                count++;
            }
        }
        System.out.println(count);

        long count1 = names.stream()
                .filter(name -> name.contains("J"))
                .count();
        System.out.println(count1);
    }

    public static void covertUserToNameList() {

        List<User> users = Arrays.asList(
                new User("Mohit", 28),
                new User("Karan", 50),
                new User("Aman", 30),
                new User("Ankit", 60)
        );

        //old
        List<String> names = new ArrayList<>();

        for(User user: users) {
            names.add(user.getName());
        }

        // Method reference
        // There should be single argument
        // There should be single function call
        // calling function should not take any argument
        // ClassName::FunctionName
        //steam
        List<String> resultNames = users.stream()
                .map(User::getName) // extract name from user object
                .toList();
    }


    public static void findFirst() {
        List<String> names = Arrays.asList("Mohit", "Jack", "Jone", "Karan", "Kartika");

        //old
        String foundName = null;
        for(String name: names) {
            if(name.contains("J")) {
                foundName = name;
                break;
            }
        }
        if(foundName != null) {
            System.out.println(foundName);
        }

//        // new
//        Optional<String> foundNameOpt = names.stream()
//                .filter(name -> name.contains("J"))
//                .findFirst();
//
//        foundNameOpt.ifPresent(System.out::println);

        // new
        names.stream()
                .filter(name -> name.contains("J"))
                .findFirst()// break
                .ifPresent(System.out::println);
                //.ifPresent(foundName1 -> System.out.println(foundName1));
    }


    public static void sum() {
        List<Integer> nums = Arrays.asList(10, 30, 30, 40);

        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();// min(), max(), average()
        System.out.println(sum);

    }

    public static void joinString() {
//        List<Container> containers = new ArrayList<>(); // user
//
//        containers.stream()
//                .filter(container -> container.isNotExpired())
//                .filter(container -> container.hasSubscribedEmail())
//                .map(container -> container.getEmail()) // string
//                .???;
//
//        "m@gmail.com, k@gmail.com, u@gmail.com"

        List<String> email = Arrays.asList("m@gmail.com", "k@gmail.com", "u@gmail.com");

        //stream
        String emails = email.stream()
                .collect(Collectors.joining(",")); // when we want to collect some data based on some operation
        System.out.println(emails);
    }


    public static void  partitionDataEvenOdd() {

        List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 9, 8, 18, 66);
        /**
         * true --> [6, 8, 28, 66]
         * false --> [1, 3, 5, 9]
         *
         * india --> [sales]
         * uk --> [sales]
         * ....
         */

        //old
        Map<Boolean, List<Integer>> partition = new HashMap<>();
        partition.put(true, new ArrayList<>());
        partition.put(false, new ArrayList<>());
        /**
         * true --> []
         * false --> []
         */

        for(Integer num: numbers) {
            if(num % 2 == 0) {
                partition.get(true).add(num);
            } else {
                partition.get(false).add(num);
            }
        }

        System.out.println(partition);


        //new
        Map<Boolean, List<Integer>> collect = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        // Collector<Integer, ?, Map<Boolean, List<Integer>>>
        System.out.println(collect);
    }

    public static void groupByStringLength() {

        List<String> names = Arrays.asList("Mohit", "Ujjwal", "Karan", "Aman", "Arun", "Krishana", "Raja Ram");

        // old

        /**
         *
         * {
         *     5 : ["Mohit", "Karan"]
         * }
         */
        Map<Integer, List<String>> grouped = new HashMap<>();

        for (String name: names) {
            Integer len = name.length(); // 5
            grouped.putIfAbsent(len, new ArrayList<>()); // if key is not present then add it else ignore¯
            grouped.get(len).add(name);
//            List<String> list = grouped.get(len); // problem ...
//            list.add(name); // NPE
        }

        System.out.println(grouped);

        //new
        Map<Integer, List<String>> collect = names.stream()
                .collect(Collectors.groupingBy(name -> name.length())); // String --> Int

        System.out.println(collect);
    }

    public static void distinct() {
        // API1 = {}
        // API2 = {}
        // API3 = {}

        List<Integer> number = Arrays.asList(1,1,2,2,3,44,5,66);

        //new
        List<Integer> list = number.stream() // 8
                .distinct()
                .toList();
        System.out.println(list);

    }

    public static void limitLoop() {

        List<Integer> numbers = Arrays.asList(1, 1);
        // get the first three record
        List<Integer> first3Number = new ArrayList<>();

        //old
        for(int index = 0; index < 3 && index < numbers.size(); index++) {
            first3Number.add(numbers.get(index));
        }
                //A1   A2  A3   A4
        // ACR: [7.8, 9.9, 4.4, 6.6]

        List<Integer> result = numbers.stream()
                .limit(3)
                .toList();

        System.out.println(result);
    }

    public static void skip3Value() {
        List<Integer> number = Arrays.asList(1,1,3,4,5,6,7,8);

        List<Integer> list = number.stream()
                .skip(3)
                .toList();

        System.out.println(list);
    }

    // UI Never sort data instead they call backend??
    // UI return --> All the data?

    /**
     * Product code, ..., stock, wh_details
     */
    public static void sort() {

        List<String> productName = Arrays.asList("P1", "P55", "P66", "P11", "P7", "P");

        List<String> sortedData = productName.stream()
                .sorted()
                .toList();

        List<String> sortedByLength = productName.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(sortedByLength);
    }

    //List --> List --> N
    public static void flatMap() {

        List<List<String>> listOfList = Arrays.asList( // Main stream
                Arrays.asList("Jhon", "Jack"), // sub steam
                Arrays.asList("Robin", "Jill"), // sub steam
                Arrays.asList("Robin", "Jill")
        );

        List<String> flatList = new ArrayList<>();


        List<String> list = listOfList.stream()
                .flatMap(l -> l.stream())
                .toList();

        List<List<List<String>>> listOfListOfList = Arrays.asList( // Main stream
                Arrays.asList(Arrays.asList("Jhon", "Jack")), // sub steam
                Arrays.asList(Arrays.asList("Robin", "Jill")), // sub steam
                Arrays.asList(Arrays.asList("Robin", "Jill"))
        );

        listOfListOfList.stream()
                .flatMap(l -> l.stream())
                .flatMap(l2 -> l2.stream())
                .toList();

    }

    public static void filterNull() {

        List<String> data = Arrays.asList(null, "Data1", null, null, "Data2");

        for(String d: data) {
            if(d == null) {
                System.out.println("d is null");
            }
        }

        List<String> result = data.stream()
                //data
                .filter(Objects::nonNull)
                //data
                .toList();
        System.out.println(result);

    }

    public static void debugging() {

        List<String> names = Arrays.asList("Mohit", "John", "Abhinav", "Jack", "Karan");

        // HLD -  (4 - 5 Year)
        // s3 for storing video
        // kafka for doing real time data processing
        // spark for calculating trending video
        // cacendra for storing comment, likes info
        // dynamo DB: for storing user info
        // SNS, SQS for EMAIL, APP Notification
        // CDN for caching the videos
        // 1M = 10L * 24 * 60 * 60 / 5
        // Bank: RDBMS - ACID
        // Gmail
        List<String> result = names.stream()
                .peek(name -> System.out.println("Before Transformation: " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("After Transformation: " + name))
                .toList();
        System.out.println(result);

    }

    public static void allMatch() {

        List<Integer> list = Arrays.asList(2, 4, 6 ,8);

        boolean result = list.stream()
                .allMatch(n -> n % 2 == 0);

        boolean result1 = list.stream()
                .anyMatch(n -> n % 2 != 0);

        boolean result2 = list.stream() // true
                .noneMatch(n -> n <= 0);

    }

    public static void reduce() {
        List<Integer> values = Arrays.asList(1, 4, 5, 7);

        Integer product = values.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(product);
    }


    public static void customStringJoining() {

        List<String> names = Arrays.asList("Mohit", "John", "Ujjwal", "Karan");

        //[Mohit, John, Ujjwal, Karan]  pdf, csv

        String resultString = names.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(resultString);
    }

    public static void groupByFirstChar() {

        List<String> names = Arrays.asList("Mohit", "John", "Ujjwal", "Karan", "Jhon", "Ujivan", "Mohan");

        /**
         * M --> [Mohit, Mohan]
         * U --> [Ujjwal, Ujivan]
         */

        Map<Character, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));
        //Collector<String, ?, Map<K, List<T>>>
        // Wild card
    }



}
