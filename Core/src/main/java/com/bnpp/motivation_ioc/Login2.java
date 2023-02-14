package com.bnpp.motivation_ioc;

public class Login2 {
    public void main() {
        FactoryDisplay d = FactoryDisplay.getInstance();
        // Display d = new DisplayImplConsole();

        Message m = new MessageImplEnglish();
        d.setMessage(m);
        d.render();
    }
}