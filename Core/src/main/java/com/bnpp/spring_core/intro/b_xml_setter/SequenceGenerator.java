package com.bnpp.spring_core.intro.b_xml_setter;

public interface SequenceGenerator {

    String getSequence();
    void setPrefix(String txt);
    void setSuffix(String txt);

}