package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdGoodType;

import java.util.List;

public interface WdGoodTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdGoodType record);

    int insertSelective(WdGoodType record);

    WdGoodType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdGoodType record);

    int updateByPrimaryKey(WdGoodType record);

    List<WdGoodType> selectAll();
}