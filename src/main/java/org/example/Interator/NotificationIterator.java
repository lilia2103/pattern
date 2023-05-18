package org.example.Interator;

import org.example.Interator.Iterator;
import org.example.Interator.Notification;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of notificationList are
    // going to iterate over.
    public  NotificationIterator (Notification[] notificationList)
    {
        this.notificationList = notificationList;
    }

    public Object next()
    {
        // return next element in the array and increment pos
        Notification notification =  notificationList[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext()
    {
        if (pos >= notificationList.length ||
                notificationList[pos] == null)
            return false;
        else
            return true;
    }
}
