package com.cn.hmc.shopping.service.Serviceimpl;

import com.cn.hmc.shopping.dao.Userdao;
import com.cn.hmc.shopping.service.UserService;
import com.cn.hmc.shopping.vo.Useres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private Userdao userdao;
    @Override
    public List<Useres> selectAll() {
        return userdao.selectAll();
    }
}
