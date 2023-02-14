package com.bnpparibas.restapi.simulator;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class SimulatorComponent {

    @Value("100")
    private int maxRandom;

    @Value("3500")
    private int blinkMillis;

}