package com.demo.followRequestState;

import com.demo.dto.*;
import com.demo.interfaces.*;
import com.demo.services.*;

public class HoldState extends State{

    public static HoldState holdState= new HoldState();
    private HoldState(){
        super(new EmailNotificationServiceImpl());
    }


    @Override
    public void notifyUser(FollowRequest followRequest) {
        notificationService.sendNotification("You have got a friend request: ", followRequest.getReceiver());
    }
}
