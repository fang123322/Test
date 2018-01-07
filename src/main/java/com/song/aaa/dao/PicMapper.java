package com.song.aaa.dao;

import com.song.aaa.po.Pic;

public interface PicMapper {
    int deleteByPrimaryKey(Integer picno);

    int insert(Pic record);

    int insertSelective(Pic record);

    Pic selectByPrimaryKey(Integer picno);

    int updateByPrimaryKeySelective(Pic record);

    int updateByPrimaryKey(Pic record);
}