package com.demo.interfaces;

import com.demo.dto.*;

public interface NotificationService {
    void sendNotification(String description, Profile profile);
}
