package org.example.interfaces;

public class Tv implements Notification{
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
