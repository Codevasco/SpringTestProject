package com.bnpparibas.restapi.simulator;

public interface Simulator {

    String getBlink();
    String getCounter();
    String getRandom();

    void refresh();

}