interface Notification {

    void send();
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }
}

public class NotificationPolymorphism {

    public static void main(String[] args) {

        Notification notification;

        notification = new EmailNotification();
        notification.send();

        notification = new SMSNotification();
        notification.send();

        notification = new PushNotification();
        notification.send();
    }
}