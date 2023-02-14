package com.bnpp.spring_core.intro.e_annot_autowired;

public interface SequenceGenerator {

    String getSequence();
    void setPrefix(String txt);
    void setSuffix(String txt);

}