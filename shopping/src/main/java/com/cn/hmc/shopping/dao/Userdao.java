package com.cn.hmc.shopping.dao;

import com.cn.hmc.shopping.vo.Useres;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface Userdao {
    List<Useres> selectAll();
}
