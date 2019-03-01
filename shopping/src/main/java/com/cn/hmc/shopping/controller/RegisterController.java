package com.cn.hmc.shopping.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class RegisterController {

    @RequestMapping("/test")
    public ModelAndView register(){
        ModelAndView mva = new ModelAndView("register");
        return mva;
    }

    @RequestMapping("test2")
    public String test(){

        return "test";
    }
//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/page/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
}
