package org.example.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasLearning {

    public static void main(String[] args) {

        // 4 FI (Functional Interface)
        // Predicate<T>: take a single argument and return a bool value
                                             // argument -> return statement
        Predicate<String> isEmailValid = email -> email.contains("@gmail.com");
        System.out.println(isEmailValid.test("mohit@gmail.com"));
        // Function<T, R> it take single argument and return a result
        Function<String, String> function = input -> "Result of input query";
        // Consumer<T>: take a single argument and return nothing
        // saved to database, print something, email, sms

        //special syntax for FI (where we only have one function)
        Consumer<String> consumer = data -> System.out.println(data);
        // Supplier<T>: take no argument and return a value
        Supplier<List<String>> top10User = () -> List.of("Mohit", "Aman");
        // return top 10 trending video

    }
}
