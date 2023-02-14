package com.bnpp.spring_core.intro.a_spring_core;

public interface SequenceGenerator {

    String getSequence();
    void setPrefix(String txt);
    void setSuffix(String txt);

}