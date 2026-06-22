interface Notification {
    void send(String message);
}
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}
class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS Sent: " + message);
    }
}
public class NotificationDemo {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        email.send("Hello Student, your result is published.");
        sms.send("Your class starts at 10 AM tomorrow.");
    }
}
