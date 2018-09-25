package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdGood;

public interface WdGoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdGood record);

    int insertSelective(WdGood record);

    WdGood selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdGood record);

    int updateByPrimaryKey(WdGood record);
}