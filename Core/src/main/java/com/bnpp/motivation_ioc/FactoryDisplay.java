package com.bnpp.motivation_ioc;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryDisplay {

    private static FactoryDisplay instance = null;
    private Display display = null;
    private final Properties properties = new Properties();

    private FactoryDisplay() {
        try {
            properties.load(new FileInputStream("C:\\Users\\Admin\\Desktop\\Workspace\\Projects\\SpringTestProject\\src\\main\\resources\\application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            final String displayString = properties.getProperty("Display.class");
            Class<?> displayClass;
            displayClass = Class.forName(displayString);
            this.display = (Display) displayClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        instance = new FactoryDisplay();
    }

    public static FactoryDisplay getInstance() {
        return instance;
    }

    public void render() {
        this.display.render();
    }

    public void setMessage(Message m) {
        this.display.setMessage(m);
    }
}