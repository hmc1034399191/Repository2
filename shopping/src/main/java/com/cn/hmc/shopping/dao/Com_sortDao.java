package com.cn.hmc.shopping.dao;

import com.cn.hmc.shopping.vo.Com_sort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface Com_sortDao {
    @Select("SELECT * FROM com_sort")
    List<Com_sort> selectAll();
}
