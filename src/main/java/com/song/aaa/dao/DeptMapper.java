package com.song.aaa.dao;

import java.util.List;

import com.song.aaa.po.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptno);
    List<Dept> selectAll();
    
    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
    
    
}