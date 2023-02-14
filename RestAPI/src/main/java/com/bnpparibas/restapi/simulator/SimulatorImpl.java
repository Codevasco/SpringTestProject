package com.bnpparibas.restapi.simulator;

import com.google.gson.annotations.Expose;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
@ToString
public class SimulatorImpl implements Simulator {

    @Autowired
    private SimulatorComponent setup;
    @Expose
    private boolean blink = false;
    @Expose
    private final AtomicInteger counter = new AtomicInteger();
    @Expose
    private float random;
    private long lastBlinkTime;

    public SimulatorImpl() {
        this.lastBlinkTime = System.currentTimeMillis();
    }

    @Override
    public String getBlink() {
        long time = System.currentTimeMillis();
        long diff = time - this.lastBlinkTime;
        if (diff > setup.getBlinkMillis()) {
            blink = !blink;
            this.lastBlinkTime = time;
        }
        return String.valueOf(blink);
    }

    @Override
    public String getCounter() {
        return String.valueOf(counter.getAndIncrement());
    }

    @Override
    public String getRandom() {
        this.random = Math.round(Math.random() * setup.getMaxRandom() * 100);
        return String.valueOf(this.random);
    }

    @Override
    public void refresh() {
        this.getBlink();
        this.getCounter();
        this.getRandom();
    }
}