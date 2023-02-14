package com.bnpp.spring_core.intro.d_annot_config;

public interface SequenceGenerator {

    String getSequence();
    void setPrefix(String txt);
    void setSuffix(String txt);

}