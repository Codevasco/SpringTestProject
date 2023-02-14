package com.bnpp.spring_core.intro.c_xml_factory;

public interface SequenceGenerator {

    String getSequence();
    void setPrefix(String txt);
    void setSuffix(String txt);

}