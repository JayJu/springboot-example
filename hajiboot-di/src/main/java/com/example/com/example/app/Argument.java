package com.example.com.example.app;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by jin on 2016. 11. 7..
 */
@Data
@RequiredArgsConstructor
public class Argument {
    private int a;
    private int b;

    public Argument(int a, int b) {
        this.a = a;
        this.b = b;
    }
}