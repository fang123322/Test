package com.song.aaa.dao;

import com.song.aaa.po.Sal;

public interface SalMapper {
    int deleteByPrimaryKey(Integer grade);

    int insert(Sal record);

    int insertSelective(Sal record);

    Sal selectByPrimaryKey(Integer grade);

    int updateByPrimaryKeySelective(Sal record);

    int updateByPrimaryKey(Sal record);
}