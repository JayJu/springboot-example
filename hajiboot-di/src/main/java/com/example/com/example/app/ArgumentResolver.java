package com.example.com.example.app;

import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * Created by jin on 2016. 11. 7..
 */
public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
