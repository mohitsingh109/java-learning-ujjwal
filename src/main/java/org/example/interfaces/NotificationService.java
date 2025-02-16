package org.example.interfaces;

public class NotificationService {

//    public void sendSms(Sms sms) {
//        sms.sendSms("text");
//    }
//
//    public void whatsApp(Whatapp whatapp) {
//        whatapp.sendWhatsappMessage("text");
//    }
//
//    public void email(Email email) {
//        email.sendEmailMessage("text");
//    }

    //send (sms, email, whatapp, tv)
    // run time poly
    public void send(Notification notification) {
        notification.send("My Test");
    }

}
