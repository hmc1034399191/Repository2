package com.cn.hmc.shopping.controller;

import com.cn.hmc.shopping.service.Serviceimpl.Com_sortServiceimpl;
import com.cn.hmc.shopping.vo.Com_sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Com_sortController {
    @Autowired
    private Com_sortServiceimpl com_sortServiceimpl;

    @RequestMapping("/showcom")
    public List<Com_sort> selectAll(){
        return com_sortServiceimpl.selectAll();
    }


}
