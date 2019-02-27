package com.cn.hmc.shopping.controller;

import com.cn.hmc.shopping.service.Serviceimpl.UserServiceimpl;
import com.cn.hmc.shopping.vo.Useres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Controller
public class UserController {
    @Autowired
    private UserServiceimpl userServiceimpl;

    @RequestMapping("/showall")
    public List<Useres> selectAll(){
        return userServiceimpl.selectAll();
    }
}
