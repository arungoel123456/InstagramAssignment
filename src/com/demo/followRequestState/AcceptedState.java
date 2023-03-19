package com.demo.followRequestState;

import com.demo.dto.*;
import com.demo.interfaces.*;
import com.demo.services.*;

public class AcceptedState extends State{
    public AcceptedState() {
        super(new SmsNotificationServiceImpl());
    }

    @Override
    public void notifyUser(FollowRequest followRequest) {
        notificationService.sendNotification("Your follow request is accepted", followRequest.getSender());
    }
}
