package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.GoodSize;

import java.util.List;

public interface GoodSizeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodSize record);

    int insertSelective(GoodSize record);

    GoodSize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodSize record);

    int updateByPrimaryKey(GoodSize record);

    List<GoodSize> selectAll();
}