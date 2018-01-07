package com.song.aaa.dao;


import java.util.List;

import com.song.aaa.po.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empno);
    List<Emp> selectAll();
    Emp selectByPrimaryKey(Integer empno);
    List<Emp> selectMrg();
    int insert(Emp record);
    int insertSelective(Emp record);
    
    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}