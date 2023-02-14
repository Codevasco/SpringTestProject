package com.bnpp.spring_core.intro.c_xml_factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        /* via JAVA Core
           SequenceGenerator sg  = new SequenceGeneratorImpl(); */

        // via XML
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("c_bean.xml");
        SequenceGenerator seqGen = (SequenceGenerator) appCtx.getBean("generator-type-3");
        appCtx.close();

        // Use Application
        /* seqGen.setPrefix("xpto");
           seqGen.setSuffix("pt"); */
        System.out.println(seqGen.getSequence());
        System.out.println(seqGen.getSequence());

    }
}