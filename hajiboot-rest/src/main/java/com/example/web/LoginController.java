package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 1015331 on 2016-11-24.
 */
@Controller
public class LoginController {
    @RequestMapping("loginForm")
    String loginForm() {
        return "loginForm";
    }
}
