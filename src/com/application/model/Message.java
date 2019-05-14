package com.application.model;

public class Message {
    public ActiveMqMessage activeMqMessage;
    Message(ActiveMqMessage activeMqMessage){
        super();
        this.activeMqMessage=activeMqMessage;
    }

    public void communicate(){
        activeMqMessage.sendMessage();
    }
}
