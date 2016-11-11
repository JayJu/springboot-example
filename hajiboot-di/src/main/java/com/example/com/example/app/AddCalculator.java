package com.example.com.example.app;

import org.springframework.stereotype.Component;

/**
 * Created by jin on 2016. 11. 7..
 */
@Component
public class AddCalculator implements Calculator {
    @Override
    public int cal(int a, int b) {
        return a + b;
    }
}
