package com.bnpp.spring_core.intro.b_xml_setter;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGeneratorImpl2 implements SequenceGenerator {

    private String prefix;
    private String suffix;
    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public String getSequence() {
        final StringBuilder sb = new StringBuilder();

        sb
                .append(this.prefix)
                .append("--")
                .append(this.counter.getAndIncrement())
                .append("--")
                .append(this.suffix);

        return sb.toString();
    }

    @Override
    public void setPrefix(String txt) {
        this.prefix = txt;
    }

    @Override
    public void setSuffix(String txt) {
        this.suffix = txt;
    }

    public static void main(String[] args) {
        SequenceGenerator sg = new SequenceGeneratorImpl2();
        sg.setPrefix("xpto");
        sg.setSuffix("pt");
        sg.getSequence();
        System.out.println(sg.getSequence());
        System.out.println(sg.getSequence());
    }
}