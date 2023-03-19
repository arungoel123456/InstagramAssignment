package com.demo.dto;

import com.demo.followRequestState.*;

public class FollowRequest {
    private Profile sender;
    private Profile receiver;
    private State followRequestState;

    public FollowRequest(Profile sender, Profile receiver) {
        this.sender = sender;
        this.receiver = receiver;
        followRequestState= HoldState.holdState;
    }

    public Profile getSender() {
        return sender;
    }

    public Profile getReceiver() {
        return receiver;
    }

    public State getFollowRequestState() {
        return followRequestState;
    }

    public void setFollowRequestState(State followRequestState) {
        this.followRequestState = followRequestState;
    }
    public void sendNotification(){
        followRequestState.notifyUser(this);
    }
}
