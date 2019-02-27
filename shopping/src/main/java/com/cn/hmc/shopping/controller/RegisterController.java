package com.cn.hmc.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    @RequestMapping("/test")
    public ModelAndView register(){
        ModelAndView mva = new ModelAndView("register");
        return mva;
    }
}
