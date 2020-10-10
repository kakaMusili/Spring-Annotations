package com.kamutech;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobilrProcessorI {
    @Override
    public void process() {

        System.out.println("World best cpu");
    }
}
