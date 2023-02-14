package com.bnpp.motivation_ioc;

public class DisplayImplConsole implements Display {

    private Message msg;

    @Override
    public void render() {
        System.out.println(this.msg.getMessage());
    }

    @Override
    public void setMessage(Message msg) {
        this.msg = msg;
    }
}