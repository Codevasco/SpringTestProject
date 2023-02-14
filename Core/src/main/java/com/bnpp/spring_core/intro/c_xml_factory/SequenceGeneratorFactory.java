package com.bnpp.spring_core.intro.c_xml_factory;

import javax.sound.midi.Sequence;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGeneratorFactory implements SequenceGenerator {

    private String prefix;
    private String suffix;
    private final AtomicInteger counter = new AtomicInteger();
    private static final SequenceGeneratorFactory instance = new SequenceGeneratorFactory();

    private SequenceGeneratorFactory() {}

    static SequenceGenerator getInstance() {
        return instance;
    }

    @Override
    public String getSequence() {
        final StringBuilder sb = new StringBuilder();

        sb
                .append(this.prefix)
                .append(".")
                .append(this.counter.getAndIncrement())
                .append("/")
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
        SequenceGenerator sg = new SequenceGeneratorFactory();
        sg.setPrefix("xpto");
        sg.setSuffix("pt");
        sg.getSequence();
        System.out.println(sg.getSequence());
        System.out.println(sg.getSequence());
    }
}