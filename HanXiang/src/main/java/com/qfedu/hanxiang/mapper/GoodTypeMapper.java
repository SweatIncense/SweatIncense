package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.GoodType;

import java.util.List;

public interface GoodTypeMapper {
    //删除
    int deleteByPrimaryKey(Integer id);
    //新增
    int insert(GoodType record);

    int insertSelective(GoodType record);

    GoodType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodType record);

    int updateByPrimaryKey(GoodType record);

    //查询所有类型
    List<GoodType> selectAll();
}