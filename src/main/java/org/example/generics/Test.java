package org.example.generics;

public class Test<T> {

    private T value; //String, Integer, Double


    public Test(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
