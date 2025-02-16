package org.example;

import org.example.interfaces.AccessService;
import org.example.interfaces.Admin;
import org.example.interfaces.Editor;
import org.example.interfaces.Email;
import org.example.interfaces.Manager;
import org.example.interfaces.NotificationService;
import org.example.interfaces.TestService;
import org.example.interfaces.Tv;
import org.example.interfaces.User;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin();
        User user = new User();
        Manager manager = new Manager();

        TestService testService = new TestService();
        testService.readDocumentByAdmin(admin);
        testService.readDocumentByUser(user);

        AccessService accessService = new AccessService();

        accessService.readDoc(admin);
        accessService.readDoc(user);
        accessService.readDoc(manager);


        //if user has email
        //if user has sms
        //if user has whataspp

        Tv tv = new Tv();
        Email email = new Email();

        NotificationService notificationService = new NotificationService();
        notificationService.send(tv);
        notificationService.send(email);
    }
}