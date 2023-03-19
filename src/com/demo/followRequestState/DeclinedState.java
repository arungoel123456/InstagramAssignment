package com.demo.followRequestState;

import com.demo.dto.*;
import com.demo.interfaces.*;
import com.demo.services.*;

public class DeclinedState extends State{
    public DeclinedState() {
        super(new EmailNotificationServiceImpl());
    }

    @Override
    public void notifyUser(FollowRequest followRequest) {
        notificationService.sendNotification("Your follow request is not accepted, Please stay away!", followRequest.getSender());
    }
}
