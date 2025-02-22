package org.example.generics;

public class TestGeneric {

    public static void main(String[] args) {

        Test<String> test1 = new Test<>("Mohit");
        System.out.println(test1.getValue());

        Test<Integer> test2 = new Test<>(10);
        System.out.println(test2.getValue());
    }
}
