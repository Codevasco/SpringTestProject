package com.bnpp.spring_core.intro.e_annot_autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        /* via JAVA Core
           SequenceGenerator sg  = new SequenceGeneratorImpl(); */

        /* via XML
           ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("b_bean.xml");
           SequenceGenerator seqGen = (SequenceGenerator) appCtx.getBean("generator-type-2");
           appCtx.close(); */

        // via Annotation
        AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(SequenceConfig.class);
        SequenceGenerator seqGen = appCtx.getBean(SequenceGenerator.class);
        appCtx.close();

        // Use Application
        seqGen.setPrefix("xpto");
        seqGen.setSuffix("pt");
        System.out.println(seqGen.getSequence());
        System.out.println(seqGen.getSequence());
    }
}