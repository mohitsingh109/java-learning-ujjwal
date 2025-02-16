package org.example.interfaces;

public class Whatapp implements Notification{

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
