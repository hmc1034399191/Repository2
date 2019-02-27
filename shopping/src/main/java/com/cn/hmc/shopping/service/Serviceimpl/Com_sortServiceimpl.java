package com.cn.hmc.shopping.service.Serviceimpl;

import com.cn.hmc.shopping.dao.Com_sortDao;
import com.cn.hmc.shopping.service.Com_sortService;
import com.cn.hmc.shopping.vo.Com_sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Com_sortServiceimpl implements Com_sortService {
    @Autowired
    private Com_sortDao com_sortDao;
    @Override
    public List<Com_sort> selectAll() {
        return com_sortDao.selectAll();
    }
}
