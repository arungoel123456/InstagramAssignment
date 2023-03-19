package com.demo.followRequestState;

import com.demo.dto.*;
import com.demo.interfaces.*;

public abstract class State {

    protected NotificationService notificationService;

    public State(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public abstract  void notifyUser(FollowRequest followRequest);

}
