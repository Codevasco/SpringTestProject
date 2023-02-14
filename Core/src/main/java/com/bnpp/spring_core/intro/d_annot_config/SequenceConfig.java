package com.bnpp.spring_core.intro.d_annot_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfig {

    @Bean
    public SequenceGenerator seqGenerator() {
        return new SequenceGeneratorImpl();
    }

}