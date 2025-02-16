package org.example.interfaces;

public class Sms implements Notification {

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
