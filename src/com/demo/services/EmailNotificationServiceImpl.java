package com.demo.services;

import com.demo.dto.*;
import com.demo.interfaces.*;

public class EmailNotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(String description, Profile profile) {
        Notification notification= new Notification(description);
        System.out.println("Hey, in email notification");
    }
}
