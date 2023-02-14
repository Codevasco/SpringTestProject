package com.bnpp.motivation_ioc;

public class Login {
    public void main() {
        Display d = new DisplayImplConsole();
        Message m = new MessageImplEnglish();
        d.setMessage(m);
        d.render();
    }
}