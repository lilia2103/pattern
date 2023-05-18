package org.example.Interator;

public class Notification {

    String notification;

    public Notification(String notification){
        this.notification = notification;
    }

    public String getNotification(){
        return notification;
    }

    public static class Main {
        public static void main(String[] args) {
            NotificationCollection nc = new NotificationCollection();
            NotificationBar nb = new NotificationBar(nc);
            nb.printNotifications();
        }
    }
}
