package com.kamutech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
            @Qualifier("snapDragon")
    MobilrProcessorI processorI;

    public MobilrProcessorI getProcessorI() {
        return processorI;
    }

    public void setProcessorI(MobilrProcessorI processorI) {
        this.processorI = processorI;
    }


    public  void configs()
    {
        System.out.println("Octa core, 12 gb Ram, 9MP camera");

        processorI.process();
    }


}
