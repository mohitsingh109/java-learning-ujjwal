package org.example.stringss;

public class StringAndStringBuilder {

    public static void main(String[] args) {
        // immutable
        String s1 = "Mohit"; //0x3272
        String s2 = new String("Mohit");  //0x3255

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2); // true  0x3272 == 0x3255
        System.out.println(s1.equals(s2)); // true Mohit == Mohit

        // string once created if you modify it will create new string

//        for(int i = 0; i < 1000000000; i++) {
//        // every time it's creating a new char array because string is immutable
//            s1 = s1 + i + "askakfhaskfhaskfhaskfha";
//        }

        // Good to used when you have lots of update operating on string
        // it takes more memory which he might not be using
        // mutable
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 10000000; i++) {
            // 10000000
            //3,210,000,000
            stringBuilder.append(i).append("askakfhaskfhaskfhaskfha");
        }
        System.out.println("Completed");
    }
}
