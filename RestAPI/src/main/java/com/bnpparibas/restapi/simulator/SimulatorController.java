package com.bnpparibas.restapi.simulator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimulatorController {

    @Autowired
    private Simulator simulator;

    @GetMapping("/simulator")
    public String getSimValues() {
        Gson json = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        simulator.refresh();
        return json.toJson(simulator);
    }

}