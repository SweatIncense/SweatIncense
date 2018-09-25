package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdSuitable;

import java.util.List;

public interface WdSuitableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdSuitable record);

    int insertSelective(WdSuitable record);

    WdSuitable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdSuitable record);

    int updateByPrimaryKey(WdSuitable record);

    List<WdSuitable> selectAll(int id);
}