package org.example.Interator;

import java.util.Iterator;

public class NotificationCollection  implements Collection {

    static final int max = 7;
    int numberOfItems = 0;
    Notification[] notificationlist;

    public NotificationCollection(){

        addItem("Not  1 ");
        addItem("not 2");
        addItem("Not 3");

}

    @Override
    public Iterator createIterator() {
        return (Iterator) new NotificationIterator(notificationlist);
    }
    private void addItem(String str) {
        Notification notification = new Notification(str);
        if(numberOfItems >= max){
            System.out.println("sax ka");
        }
        else {

            notificationlist[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1 ;

        }
    }
}
