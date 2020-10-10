package com.kamutech;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobilrProcessorI {
    @Override
    public void process() {
        System.out.println("2nd best processor");
    }
}
